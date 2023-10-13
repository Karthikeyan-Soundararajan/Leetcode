package Oct_2023.oct13;

import java.util.stream.IntStream;

public class Min_Cost_Climbing_Stairs {

    public int minCostClimbingStairs(int[] cost) {

//        int []dp = new int[cost.length];
//        if(cost.length<=1)
//            return cost[0];
//        dp[cost.length-1] = cost[cost.length-1];
//        dp[cost.length-2] = cost[cost.length-2];
//        for (int i = cost.length-3; i >= 0; i--) {
//            dp[i] = cost[i] + Math.min(dp[i+1], dp[i+2]);
//        }
//        return Math.min(dp[0], dp[1]);

        int []dp = new int[cost.length+1];
        IntStream.range(2, dp.length).forEach(index -> {
            dp[index] = Math.min(dp[index-1]+cost[index-1], dp[index-2]+cost[index-2]);
        });
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        Min_Cost_Climbing_Stairs min_cost_climbing_stairs = new Min_Cost_Climbing_Stairs();
        System.out.println(min_cost_climbing_stairs.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
}
