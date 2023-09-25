package Sep_2023.sep22;

public class Is_Subsequence_392 {

    public boolean isSubsequence(String s, String t) {
        boolean isSubSequence = true;
        for (int i = 0; i < s.length(); i++) {
            if (t.indexOf(s.charAt(i))==-1){
                isSubSequence = false;
                break;
            }
            t = t.substring(t.indexOf(s.charAt(i))+1);
        }
        return isSubSequence;
    }

    public static void main(String[] args) {
        Is_Subsequence_392 isSubsequence392 = new Is_Subsequence_392();
        System.out.println(isSubsequence392.isSubsequence("aec","abcde"));
    }
}
