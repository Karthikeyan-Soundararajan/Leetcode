package Nov_2023.nov1;

import Oct_2023.oct24.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Find_Mode_In_Binary_Search_Tree {

    int max_count=0;
    Map<Integer, Integer> frequency = new HashMap<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        return frequency.entrySet().stream().filter(entry -> entry.getValue() == max_count).mapToInt(entry -> entry.getKey()).toArray();
    }

    private void inorder(TreeNode root) {
        if(root==null){
            return;
        }
        frequency.put(root.val, frequency.getOrDefault(root.val,0)+1);
        max_count = Math.max(max_count, frequency.get(root.val));
        inorder(root.left);
        inorder(root.right);
    }

    public static void main(String[] args) {

    }
}
