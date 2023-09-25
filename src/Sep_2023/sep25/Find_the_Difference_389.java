package Sep_2023.sep25;

public class Find_the_Difference_389 {

    public char findTheDifference(String s, String t) {
        char differentCharacter = 0;
        for (int i = 0; i < t.length(); i++) {
            if(s.indexOf(t.charAt(i))==-1){
                differentCharacter = t.charAt(i);
                break;
            }
        }
        return differentCharacter;
    }

    public static void main(String[] args) {
        Find_the_Difference_389 findTheDifference389 = new Find_the_Difference_389();
        System.out.println(findTheDifference389.findTheDifference("ab","abc"));
    }
}
