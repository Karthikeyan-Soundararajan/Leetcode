package Oct_2023.oct11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Number_of_flowers_in_full_bloom {

    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
//        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
//        for (int i = 0; i < flowers.length; i++) {
//            for (int j = flowers[i][0]; j <= flowers[i][flowers[i].length-1]; j++) {
//                countMap.put(j,countMap.getOrDefault(j,0)+1);
//            }
//        }
//        int[] out = new int[people.length];
//        for (int i = 0; i < people.length; i++) {
//            out[i] = countMap.getOrDefault(people[i],0);
//        }
//        return out;
        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int[] count = new int[people.length];
        for (int i = 0; i < people.length; i++) {
            int day = people[i];
            int startVal = findLeft(start,day,true);
            int endVal = findLeft(end,day,false);
            count[i] = endVal-startVal;
        }    
        return count;
    }

    private int findLeft(int[] arr, int target, boolean isLeft) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end) / 2;
            if(arr[mid]==target){
                return arr[mid];
            } else if (isLeft) {
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Number_of_flowers_in_full_bloom numberOfFlowersInFullBloom = new Number_of_flowers_in_full_bloom();
        int[] out = numberOfFlowersInFullBloom.fullBloomFlowers(new int[][]{
                {1,10},{3,3}
        }, new int[]{3,3,2});
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }
}
