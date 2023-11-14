package Nov_2023.nov14;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class Unique_lengt_3_palindromic_subsequence {

    public int countPalindromicSubsequence(String s) {
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
             uniqueChars.add(s.charAt(i));
        }
        int count = 0;
        for (char c : uniqueChars) {
            int start = s.indexOf(c);
            int end = s.lastIndexOf(c);
            if(start<end)
            {
                Set<Character> charSet = new HashSet<>();
                for (int j = start+1; j < end; j++) {
                    charSet.add(s.charAt(j));
                }
                count += charSet.size();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Unique_lengt_3_palindromic_subsequence uniqueLengt3PalindromicSubsequence = new Unique_lengt_3_palindromic_subsequence();
        System.out.println(uniqueLengt3PalindromicSubsequence.countPalindromicSubsequence("adc"));
    }
}
