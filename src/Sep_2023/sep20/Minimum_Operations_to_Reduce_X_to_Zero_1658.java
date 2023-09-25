package Sep_2023.sep20;

import java.util.Arrays;

public class Minimum_Operations_to_Reduce_X_to_Zero_1658 {

    public int minOperations(int[] nums, int x) {
        int totalSum = Arrays.stream(nums).sum();
        int target = totalSum - x; // Calculate the target sum difference

        if (target < 0)
            return -1; // Return -1 if target sum is not achievable

        if (target == 0)
            return nums.length; // Return the number of elements if target sum is 0

        int n = nums.length; // Number of elements in the array
        int minOperations = Integer.MAX_VALUE; // Minimum operations to achieve the target sum
        int currentSum = 0; // Current sum of elements
        int leftIndex = 0, rightIndex = 0; // Pointers for the sliding window

        while (rightIndex < n) {
            currentSum += nums[rightIndex];
            rightIndex++;

            while (currentSum > target && leftIndex < n) {
                currentSum -= nums[leftIndex];
                leftIndex++;
            }

            if (currentSum == target)
                minOperations = Math.min(minOperations, n - (rightIndex - leftIndex));
        }

        return (minOperations == Integer.MAX_VALUE) ? -1 : minOperations;
    }

    public static void main(String[] args) {
        Minimum_Operations_to_Reduce_X_to_Zero_1658 minimumOperationsToReduceXToZero1658 = new Minimum_Operations_to_Reduce_X_to_Zero_1658();
        System.out.println(minimumOperationsToReduceXToZero1658.minOperations(new int[]{3,2,20,1,1,3},10));
    }
}
