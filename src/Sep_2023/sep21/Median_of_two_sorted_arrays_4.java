package Sep_2023.sep21;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Median_of_two_sorted_arrays_4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> sortedList = IntStream.concat(IntStream.of(nums1),IntStream.of(nums2)).boxed().sorted().collect(Collectors.toList());
        double median = 0;
        if(sortedList.size()%2==0){
            median = sortedList.get(sortedList.size()/2-1)+sortedList.get(sortedList.size()/2);
            median = median/2;
        }else {
            median = sortedList.get(sortedList.size()/2);
        }
        return median;
    }

    public static void main(String[] args) {
        Median_of_two_sorted_arrays_4 medianOfTwoSortedArrays4 = new Median_of_two_sorted_arrays_4();
        System.out.println(medianOfTwoSortedArrays4.findMedianSortedArrays(new int[]{1,3},new int[]{2}));
    }
}
