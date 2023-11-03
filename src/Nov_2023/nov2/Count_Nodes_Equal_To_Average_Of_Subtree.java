package Nov_2023.nov2;

import Oct_2023.oct24.TreeNode;

public class Count_Nodes_Equal_To_Average_Of_Subtree {

    int matchingCount=0;
    public int averageOfSubtree(TreeNode root) {
        calculateSubtreeValues(root);
        return matchingCount;
    }

    private int[] calculateSubtreeValues(TreeNode root){
        if(root == null){
            return new int[]{0,0};
        }

        int[] leftTreeValues = calculateSubtreeValues(root.left);
        int[] rightTreeValues = calculateSubtreeValues(root.right);
        int count = leftTreeValues[0] + rightTreeValues[0]+1;
        int sum = leftTreeValues[1] + rightTreeValues[1]+ root.val;
        if (count!=0 && (sum / count) == root.val){
            matchingCount++;
        }
        return new int[]{count,sum};
    }

    public static void main(String[] args) {

    }
}
