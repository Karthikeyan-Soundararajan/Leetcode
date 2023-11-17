package Nov_2023.nov17;

import java.util.Arrays;

public class Minimize_Maximum_Pair_Sum_In_Array {

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        int result = 0;
        while (left<right) {
            result = Math.max(result, nums[left]+nums[right]);
            left++;
            right--;
        }
        return result;
    }

    public static void main(String[] args) {
        Minimize_Maximum_Pair_Sum_In_Array minimizeMaximumPairSumInArray = new Minimize_Maximum_Pair_Sum_In_Array();
        System.out.println(minimizeMaximumPairSumInArray.minPairSum(new int[]{3,5,4,2,4,6}));
    }
}
