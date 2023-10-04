package Oct_2023.oct_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Number_of_good_pairs_1512 {

    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Long> countMap = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        AtomicInteger count = new AtomicInteger();
        countMap.entrySet().stream().filter(elementCountEntry -> elementCountEntry.getValue()>1).forEach(elementCountEntry -> {
            long dividend =  elementCountEntry.getValue() * (elementCountEntry.getValue() - 1);
            count.addAndGet((int) (dividend / 2));
        });
        return count.get();
    }

    public static void main(String[] args) {
        Number_of_good_pairs_1512 numberOfGoodPairs1512 = new Number_of_good_pairs_1512();
        System.out.println(numberOfGoodPairs1512.numIdenticalPairs(new int[]{1,1,1,1}));
    }
}
