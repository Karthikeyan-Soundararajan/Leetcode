package Nov_2023.nov18;

import java.util.Arrays;

public class Frequency_of_the_most_frequent_element {

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        int left=0,right = nums.length-1, n= nums.length-1;
        int[] result = new int[nums.length];
        while (left<right){
            result[n--]=nums[left++];
            result[n--]=nums[right--];
        }
        if(nums.length%2==1){
            result[n--]=nums[left++];
        }
        int count = 1;
        System.out.println(Arrays.toString(result));
        for (int i = 1; i < result.length; i++) {
            int diff = Math.abs(result[i]-result[i-1]);
            if(diff <= k){
                count++;
                k-=diff;
            }else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Frequency_of_the_most_frequent_element frequencyOfTheMostFrequentElement = new Frequency_of_the_most_frequent_element();
        System.out.println(frequencyOfTheMostFrequentElement.maxFrequency(new int[]{9930,9923,9983,9997,9934,9952,9945,9914,9985,9982,9970,9932,9985,9902,9975,9990,9922,9990,9994,9937,9996,9964,9943,9963,9911,9925,9935,9945,9933,9916,9930,9938,10000,9916,9911,9959,9957,9907,9913,9916,9993,9930,9975,9924,9988,9923,9910,9925,9977,9981,9927,9930,9927,9925,9923,9904,9928,9928,9986,9903,9985,9954,9938,9911,9952,9974,9926,9920,9972,9983,9973,9917,9995,9973,9977,9947,9936,9975,9954,9932,9964,9972,9935,9946,9966},3056));
    }
}
