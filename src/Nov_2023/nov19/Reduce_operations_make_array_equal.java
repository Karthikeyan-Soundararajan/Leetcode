package Nov_2023.nov19;

import java.util.Arrays;

public class Reduce_operations_make_array_equal {

    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int result = 0, count = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                count++;
            }
            result+=count;
        }
        return result;
    }
    public static void main(String[] args) {
        Reduce_operations_make_array_equal reduceOperationsMakeArrayEqual = new Reduce_operations_make_array_equal();
        System.out.println(reduceOperationsMakeArrayEqual.reductionOperations(new int[]{1, 3, 3, 5, 5, 5, 8}));
    }
}
