package Sep_2023.sep12;

import java.util.*;

public class MinDeletions {

    public int minDeletions(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        int deletionCount = 0;
        for (int i = 0; i < s.length(); i++) {
            countMap.put(s.charAt(i),countMap.getOrDefault(s.charAt(i),0)+1);
        }
        List<Integer> countList = new ArrayList<>(countMap.values());
        Collections.sort(countList,Collections.reverseOrder());
        Set<Integer> usedFrequencies = new HashSet<>();
        for (int i = 0; i < countList.size(); i++) {
            if(usedFrequencies.contains(countList.get(i))){
                int temp = countList.get(i);
                while (temp>0 && usedFrequencies.contains(temp)){
                    temp--;
                    deletionCount++;
                }
                usedFrequencies.add(temp);
            }else {
                usedFrequencies.add(countList.get(i));
            }
        }
        return deletionCount;
    }

    public static void main(String[] args) {
        MinDeletions minDeletions = new MinDeletions();
        System.out.println(minDeletions.minDeletions("aab"));
    }
}
