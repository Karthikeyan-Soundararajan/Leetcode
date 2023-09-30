package Sep_2023.sep29;

public class Monotonic_Array_896 {

    public boolean isMonotonic(int[] nums) {
        if(nums.length<=1)
            return true;
        boolean isIncreasingMotonic = true;
        boolean isDecreasingMotonic = true;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]>nums[i+1]){
                isIncreasingMotonic = false;
                break;
            }
        }
        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i-1]<nums[i]){
                isDecreasingMotonic = false;
                break;
            }
        }
        if(isDecreasingMotonic || isIncreasingMotonic)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Monotonic_Array_896 monotonicArray896 = new Monotonic_Array_896();
        System.out.println(monotonicArray896.isMonotonic(new int[]{7,3,2,4}));
    }
}
