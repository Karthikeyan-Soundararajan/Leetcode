package Nov_2023.nov4;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class last_moment_before_all_ants_fall {

    public int getLastMoment(int n, int[] left, int[] right) {
        OptionalInt maxLeft = IntStream.of(left).max();
        OptionalInt minRight = IntStream.of(right).min();
        int maxRight = n - minRight.orElse(n);
        return Math.max(maxLeft.orElse(0),maxRight);
    }

    public static void main(String[] args) {
        last_moment_before_all_ants_fall lastMomentBeforeAllAntsFall = new last_moment_before_all_ants_fall();
        System.out.println(lastMomentBeforeAllAntsFall.getLastMoment(20,new int[]{4,7,15},new int[]{9,3,13,10}));
    }

}
