package Nov_2023.nov20;

public class Minimum_amount_of_time_to_collect_garbage {

    public int garbageCollection(String[] garbage, int[] travel) {
        int metalTruckTime = 0, paperTruckTime = 0, glassTruckTime =0,currentLength=0, totalTime = garbage[0].length();
        for (int i = 1; i < garbage.length; i++) {
            totalTime += garbage[i].length();
            currentLength += travel[i-1];
            if(garbage[i].contains("M")){
                metalTruckTime = currentLength;
            }
            if(garbage[i].contains("G")){
                glassTruckTime = currentLength;
            }
            if(garbage[i].contains("P")){
                paperTruckTime = currentLength;
            }
        }
        return totalTime+metalTruckTime+glassTruckTime+paperTruckTime;
    }

    public static void main(String[] args) {
        Minimum_amount_of_time_to_collect_garbage minimumAmountOfTimeToCollectGarbage = new Minimum_amount_of_time_to_collect_garbage();
        System.out.println(minimumAmountOfTimeToCollectGarbage.garbageCollection(new String[]{"MMM","PGM","GP"},new int[]{3,10}));
    }
}
