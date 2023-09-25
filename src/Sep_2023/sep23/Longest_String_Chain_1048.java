package Sep_2023.sep23;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Longest_String_Chain_1048 {

    public int longestStrChain(String[] words) {
        Arrays.sort(words,(s1,s2)-> s1.length()-s2.length());
        int ans = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            int longest = 0;
            for (int i = 0; i < word.length(); i++) {
                String sb = word.substring(0,i)+word.substring(i+1);
                longest = Math.max(longest,map.getOrDefault(sb,0)+1);
            }
            map.put(word,longest);
            ans = Math.max(ans,longest);
        }
        return ans;
    }
    public static void main(String[] args) {
        Longest_String_Chain_1048 longestStringChain1048 = new Longest_String_Chain_1048();
        System.out.println(longestStringChain1048.longestStrChain(new String[]{"a","b","ba","bca","bda","bdca"}));
        System.out.println(longestStringChain1048.longestStrChain(new String[]{"xbc","pcxbcf","xb","cxbc","pcxbc"}));
        System.out.println(longestStringChain1048.longestStrChain(new String[]{"abcd","dbqca"}));
        System.out.println(longestStringChain1048.longestStrChain(new String[]{"a","b","ba","bca","bda","bdca"}));
    }
}
