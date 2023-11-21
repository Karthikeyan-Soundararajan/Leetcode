package Nov_2023.nov21;

import java.util.HashMap;
import java.util.Map;

public class Count_Nice_pairs_in_an_array {

    public int reverse(int number){
        int reverseNumber = 0;
        while (number>0){
            reverseNumber = (reverseNumber*10)+(number % 10);
            number = number / 10;
        }
        return reverseNumber;
    }

    public int countNicePairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int result = 0;
        for (var num : nums){
            var reverse = reverse(num);
            var a = countMap.getOrDefault(num-reverse,0);
            result = (result+a) % 1000000007;
            countMap.put(num-reverse, a+1);
        }
        return result;
    }

    public static void main(String[] args) {
        Count_Nice_pairs_in_an_array countNicePairsInAnArray = new Count_Nice_pairs_in_an_array();
        System.out.println(countNicePairsInAnArray.countNicePairs(new int[]{13,10,35,24,76}));
    }
}
