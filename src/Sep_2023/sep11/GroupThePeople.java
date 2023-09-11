package Sep_2023.sep11;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GroupThePeople {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> groupBucket = new HashMap<Integer, List<Integer>>(groupSizes.length);
        List<List<Integer>> finalOut = new ArrayList<List<Integer>>();
        for (int i = 0; i < groupSizes.length; i++) {
                groupBucket.putIfAbsent(groupSizes[i], new ArrayList<Integer>());
                groupBucket.get(groupSizes[i]).add(i);
                if(groupBucket.get(groupSizes[i]).size() == groupSizes[i]){
                    finalOut.add(new ArrayList<>(groupBucket.get(groupSizes[i])));
                    groupBucket.get(groupSizes[i]).clear();
                }
        }

//        for (Map.Entry<Integer, List<Integer>> entrySet : groupBucket.entrySet()){
//            for (int i = 0; i < entrySet.getValue().size(); i=i+entrySet.getKey()) {
//                List<Integer> newList = new ArrayList<Integer>(entrySet.getKey());
//                for (int j = i; j < i+entrySet.getKey(); j++) {
//                    newList.add(entrySet.getValue().get(j));
//                }
//                finalOut.add(newList);
//            }
//        }
        return finalOut;
    }

    public static void main(String[] args) {
        GroupThePeople groupThePeople = new GroupThePeople();
        System.out.println(groupThePeople.groupThePeople(new int[]{2,1,3,3,3,2}));
    }
}
