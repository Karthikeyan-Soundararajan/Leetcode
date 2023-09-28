package Sep_2023.sep28;

import java.util.Comparator;
import java.util.stream.IntStream;

public class Sort_Array_by_parity_905 {

    public int[] sortArrayByParity(int[] nums) {
        return IntStream.of(nums).boxed().sorted(Comparator.comparingInt(value -> {
            if(value % 2 ==1){
                return 1;
            }else {
                return -1;
            }
        })).mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
      Sort_Array_by_parity_905 sortArrayByParity905 = new Sort_Array_by_parity_905();
      System.out.println(sortArrayByParity905.sortArrayByParity(new int[]{3,1,2,4}));
    }
}
