package Sep_2023.sep26;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Remove_Duplicate_Letters_316 {
    public String removeDuplicateLetters(String s) {
        boolean[] isVisted = new boolean[26];
        Stack<Character> uniqueString = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(!isVisted[s.charAt(i)-'a']){
                while (!uniqueString.isEmpty()&&uniqueString.peek().compareTo(s.charAt(i))>0&&s.lastIndexOf(uniqueString.peek())>i){
                    isVisted[uniqueString.pop()-'a'] = false;
                }
                isVisted[uniqueString.push(s.charAt(i))-'a'] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        uniqueString.stream().forEach(character -> sb.append(character));
        return sb.toString();
    }

    public static void main(String[] args) {
        Remove_Duplicate_Letters_316 removeDuplicateLetters316 = new Remove_Duplicate_Letters_316();
        System.out.println(removeDuplicateLetters316.removeDuplicateLetters("abacb"));
    }
}
