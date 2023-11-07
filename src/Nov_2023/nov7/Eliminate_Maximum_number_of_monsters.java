package Nov_2023.nov7;

import java.util.Arrays;

public class Eliminate_Maximum_number_of_monsters {

    public int eliminateMaximum(int[] dist, int[] speed) {
        double[] time_to_city = new double[dist.length];
        for (int i = 0; i < time_to_city.length; i++) {
            time_to_city[i] = (double) dist[i] / speed[i];
        }
        Arrays.sort(time_to_city);
        for (int i = 0; i < dist.length; i++) {
            if(time_to_city[i]<= i){
                return i;
            }
        }
        return dist.length;
    }

    public static void main(String[] args) {
        Eliminate_Maximum_number_of_monsters eliminateMaximumNumberOfMonsters = new Eliminate_Maximum_number_of_monsters();
        System.out.println(eliminateMaximumNumberOfMonsters.eliminateMaximum(new int[]{3,5,7,4,5},new int[]{2,3,6,3,2}));
        System.out.println(eliminateMaximumNumberOfMonsters.eliminateMaximum(new int[]{1,1,2,3},new int[]{1,1,1,1}));
        System.out.println(eliminateMaximumNumberOfMonsters.eliminateMaximum(new int[]{4,3,4},new int[]{1,1,2}));
    }
}
