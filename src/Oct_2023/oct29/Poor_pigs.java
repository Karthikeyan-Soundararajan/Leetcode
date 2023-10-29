package Oct_2023.oct29;

public class Poor_pigs {

    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int noOfTestCases = minutesToTest / minutesToDie;
        int i = 0;
        while (Math.pow(noOfTestCases+1,i) < buckets){
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        Poor_pigs poor_pigs = new Poor_pigs();
        System.out.println(poor_pigs.poorPigs(4,15,30));
    }
}
