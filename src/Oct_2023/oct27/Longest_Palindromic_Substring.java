package Oct_2023.oct27;

public class Longest_Palindromic_Substring {

    int start=0, maxLen = 0;
    public String longestPalindrome(String s) {
//        if(s.length()%2==0){
//            s= s.substring(0,s.length()/2)+'_'+s.substring((s.length()/2),s.length());
//        }
        for (int i = 0; i < s.length(); i++) {
            expandPalindrome(s,i,i);
            expandPalindrome(s,i,i+1);
        }
//        s = s.substring(start,start+maxLen).replaceAll("_","");
        return s.substring(start,start+maxLen);
    }

    private void expandPalindrome(String input, int startIndex, int endIndex) {
        while (startIndex>=0&&endIndex<input.length()&&input.charAt(startIndex)==input.charAt(endIndex)){
            startIndex--;
            endIndex++;
        }
        int currentLength = endIndex-startIndex-1;
        if (currentLength>maxLen){
            maxLen = currentLength;
            start = startIndex+1;
        }
    }

    public static void main(String[] args) {
        Longest_Palindromic_Substring longestPalindromicSubstring = new Longest_Palindromic_Substring();
        System.out.println(longestPalindromicSubstring.longestPalindrome("abb"));
    }
}
