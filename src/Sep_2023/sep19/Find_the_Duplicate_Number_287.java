package Sep_2023.sep19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Find_the_Duplicate_Number_287 {

    public int findDuplicate(int[] nums) {
//        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
//        for (int i = 0; i < numsList.size(); i++) {
//            if(numsList.lastIndexOf(numsList.get(i)) > i){
//                temp = numsList.get(i);
//                break;
//            }
//        }
//        return temp;
        int temp = 0;
        Set<Integer> countSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(!countSet.add(nums[i])){
                temp = nums[i];
                break;
            }
        }
        return temp;
    }
    
    public static void main(String[] args) {
        Find_the_Duplicate_Number_287 findTheDuplicateNumber287 = new Find_the_Duplicate_Number_287();
        System.out.println(findTheDuplicateNumber287.findDuplicate(new int[]{1,3,4,2,2}));
    }
}
