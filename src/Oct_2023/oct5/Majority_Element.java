package Oct_2023.oct5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Majority_Element {

    public List<Integer> majorityElement(int[] nums) {
        int threshold = nums.length /3;
        Map<Integer, Long> countMap = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        return countMap.entrySet().stream().filter(integerLongEntry -> integerLongEntry.getValue() > threshold).map(integerLongEntry -> integerLongEntry.getKey().intValue()).collect(Collectors.toList());

}

    public static void main(String[] args) {
        Majority_Element majority_element = new Majority_Element();
        System.out.println(majority_element.majorityElement(new int[]{3,2,3}));
    }
}
