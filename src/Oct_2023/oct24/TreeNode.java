package Oct_2023.oct24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxValues = new ArrayList<Integer>();
        if(root == null){
            return maxValues;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            int max_value = Integer.MIN_VALUE;
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                max_value = Math.max(max_value,currentNode.val);
                if (currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
            maxValues.add(max_value);
        }
        return maxValues;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        List<Integer> maxValues = treeNode.largestValues(treeNode);
    }
}
