package Sep_2023.sep24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Champagne_Tower_799 {

    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] filledLevel = new double[query_row+1];
        Arrays.fill(filledLevel,0);
        int filledCups = 0;
        if(poured>=1){
            filledCups++;
            filledLevel[0] = 1;
        }
        int cupsToFill = 1;
        for (int i = 1; i < filledLevel.length; i++) {
            if (i<3) {
                cupsToFill = cupsToFill +1;
                if(poured-filledCups>=cupsToFill){
                    filledCups = filledCups + cupsToFill;
                    filledLevel[i] = 1;
                }else {
                    int remaining = poured-filledCups;
                    filledLevel[i] = (double) remaining / cupsToFill;
                    break;
                }
            }else{
                cupsToFill = cupsToFill + 2;
                if(poured-filledCups>=cupsToFill){
                    filledCups = filledCups+cupsToFill;
                    filledLevel[i] = 1;
                }else {
                    int remaining = poured-filledCups;
                    filledLevel[i] = (double) remaining / cupsToFill;
                    break;
                }
            }
        }
        return filledLevel[filledLevel.length-1];
    }

    public static void main(String[] args) {
        Champagne_Tower_799 champagneTower799 = new Champagne_Tower_799();
        System.out.println(champagneTower799.champagneTower(25,6,1));
//        System.out.println(champagneTower799.champagneTower(2,1,1));
//        System.out.println(champagneTower799.champagneTower(100000009,33,17));
    }
}
