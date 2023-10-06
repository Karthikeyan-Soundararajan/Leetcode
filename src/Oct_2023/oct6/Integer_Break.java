package Oct_2023.oct6;

public class Integer_Break {

    public int integerBreak(int n) {
        if(n<=3){
            return n-1;
        }
        int quotient = n/3, remainder = n%3;
        return remainder ==0 ? (int) Math.pow(3,quotient) : remainder == 1 ? (int) Math.pow(3, quotient-1) * 4 : (int) Math.pow(3, quotient) * 2;
    }

    public static void main(String[] args) {
        Integer_Break integerBreak = new Integer_Break();
        System.out.println(integerBreak.integerBreak(10));
    }
}
