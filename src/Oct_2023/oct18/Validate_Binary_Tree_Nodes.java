package Oct_2023.oct18;

import java.util.*;

public class Validate_Binary_Tree_Nodes {

    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] inDegree = new int[n];
        Map<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < n; i++) {
            if (leftChild[i]!=-1){
                graph.computeIfAbsent(i,integer -> new ArrayList<Integer>()).add(leftChild[i]);
                inDegree[leftChild[i]]++;
            }
            if (rightChild[i]!=-1){
                graph.computeIfAbsent(i,integer -> new ArrayList<Integer>()).add(rightChild[i]);
                inDegree[rightChild[i]]++;
            }
        }
        List<Integer> rootElements = new ArrayList<Integer>();
        for (int i = 0; i < inDegree.length; i++) {
            if(inDegree[i] == 0){
                rootElements.add(i);
            }
        }
        if(rootElements.size() != 1){
            return false;
        }
        Queue<Integer> tree = new LinkedList<Integer>();
        Set<Integer> seen = new HashSet<Integer>();
        tree.add(rootElements.get(0));
        seen.add(rootElements.get(0));
        while (!tree.isEmpty()){
            int node = tree.poll();
            if(graph.containsKey(node)){
                for (int data: graph.get(node)) {
                    if(seen.contains(data)){
                        return false;
                    }
                    tree.add(data);
                    seen.add(data);
                }
            }
        }
        return seen.size() == n;
    }

    public static void main(String[] args) {
        Validate_Binary_Tree_Nodes validate_binary_tree_nodes = new Validate_Binary_Tree_Nodes();
        System.out.println(validate_binary_tree_nodes.validateBinaryTreeNodes(4, new int[]{1,-1,3,-1}, new int[]{2,-1,-1,-1}));
    }
}
