package Oct_2023.Oct_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse_Words_in_a_String_III_557 {
    public String reverseWords(String s) {
        return Arrays
                .stream(s.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        Reverse_Words_in_a_String_III_557 reverseWordsInAStringIii557 = new Reverse_Words_in_a_String_III_557();
        System.out.println(reverseWordsInAStringIii557.reverseWords("God Ding"));
    }

}
