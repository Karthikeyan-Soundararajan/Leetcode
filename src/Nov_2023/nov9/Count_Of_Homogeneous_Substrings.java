package Nov_2023.nov9;

public class Count_Of_Homogeneous_Substrings {

    public int countHomogenous(String s) {
        long result = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=s.charAt(start)){
                result = updateResult(i,start,result);
                start = i;
            }
        }
        result = updateResult(s.length(),start,result);
        return (int) (result % 100000007);
    }

    public long updateResult(int end, int start, long result){
        int curLen = end - start;
        result += (curLen * (curLen+1) / 2);
        return result;
    }


    public static void main(String[] args) {
            Count_Of_Homogeneous_Substrings countOfHomogeneousSubstrings = new Count_Of_Homogeneous_Substrings();
            System.out.println(countOfHomogeneousSubstrings.countHomogenous("abbcccaa"));
    }

}
