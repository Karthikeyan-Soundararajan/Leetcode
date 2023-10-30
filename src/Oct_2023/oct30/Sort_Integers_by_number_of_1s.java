package Oct_2023.oct30;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sort_Integers_by_number_of_1s {

    public int[] sortByBits(int[] arr) {
        Integer[] data = IntStream.of(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(data,(a,b)->{
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            return countA == countB ? a -b : countA - countB;
        });
        return Arrays.stream(data).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Sort_Integers_by_number_of_1s sortIntegersByNumberOf1s = new Sort_Integers_by_number_of_1s();
        System.out.println(Arrays.toString(sortIntegersByNumberOf1s.sortByBits(new int[]{0,1,2,3,4,5,6,7,8})));
    }
}
