package Oct_2023.Oct_2;

import java.util.stream.IntStream;

public class Remove_Colored_Pieces {

    public boolean winnerOfGame(String colors) {
        final int[] countOfAlice = {0};
        final int[] countOfBob = {0};
        if(colors.length()==0)
            return false;
        final char[] c = {0};
        IntStream.range(0,colors.length()-1).forEach(i -> {
            if (c[0] == colors.charAt(i)) {
                if (colors.charAt(i + 1) == c[0]) {
                    if (colors.charAt(i) == 'A') {
                        countOfAlice[0]++;
                    } else {
                        countOfBob[0]++;
                    }
                }
            }else {
                c[0] = colors.charAt(i);
            }
        });
        return countOfAlice[0] - countOfBob[0] > 0;
    }

    public static void main(String[] args) {
        Remove_Colored_Pieces removeColoredPieces = new Remove_Colored_Pieces();
        System.out.println(removeColoredPieces.winnerOfGame("ABBBBBBBAAA"));
    }
}
