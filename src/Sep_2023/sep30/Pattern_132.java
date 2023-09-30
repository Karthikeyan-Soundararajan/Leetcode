package Sep_2023.sep30;

import java.util.Stack;

public class Pattern_132 {

    public boolean find132pattern(int[] nums) {
        int second = Integer.MIN_VALUE;
        for (int i = nums.length-2; i >=0 ; i--) {
            if(second > nums[i])
                return true;
            if(nums[i+1]<nums[i]){
                second = nums[i+1];
            }
        }
//        return false;
//        Stack<Integer> stack = new Stack<Integer>();
//        for (int i = nums.length-1; i >=0 ; i--) {
//            if(second > nums[i])
//                return true;
//            while (!stack.isEmpty()&&stack.peek() < nums[i]){
//                second = stack.pop();
//            }
//            stack.push(nums[i]);
//        }
        return false;
    }

    public static void main(String[] args) {
        Pattern_132 pattern132 = new Pattern_132();
        System.out.println(pattern132.find132pattern(new int[]{3,5,0,3,4}));
    }
}
