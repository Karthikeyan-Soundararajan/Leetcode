package Aug_2023.aug31;

import java.util.Arrays;

public class MinimumNoOfTaps {

    public int minTaps(int n, int[] ranges) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE-1);
        dp[0] = 1;
        for (int i = 0; i <= n ; i++) {
            int tapStart = Math.max(0, i-ranges[i]);
            int tapEnd = Math.min(n, i+ranges[i]);
            for (int j = tapStart; j <= tapEnd; j++) {
                dp[tapEnd] = Math.min(dp[tapEnd],dp[j]);
            }
        }
        if(dp[n]==Integer.MAX_VALUE-1){
            return -1;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        MinimumNoOfTaps minimumNoOfTaps = new MinimumNoOfTaps();
        System.out.println(minimumNoOfTaps.minTaps(7, new int[]{1,2,1,0,2,1,0,1}));
    }

}
