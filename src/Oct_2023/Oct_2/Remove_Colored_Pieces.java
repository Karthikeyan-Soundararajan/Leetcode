package Oct_2023.Oct_2;

public class Remove_Colored_Pieces {

    public boolean winnerOfGame(String colors) {
        int countOfAlice = 0;
        int countOfBob = 0;
        if(colors.length()==0)
            return false;
        char c = 0;
        for (int i = 0; i < colors.length()-1; i++) {
            if (c == colors.charAt(i)) {
                if (colors.charAt(i + 1) == c) {
                    if (colors.charAt(i) == 'A') {
                        countOfAlice++;
                    } else {
                        countOfBob++;
                    }
                }
            }else {
                c = colors.charAt(i);
            }
        }
        if(countOfAlice-countOfBob>0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Remove_Colored_Pieces removeColoredPieces = new Remove_Colored_Pieces();
        System.out.println(removeColoredPieces.winnerOfGame("ABBBBBBBAAA"));
    }
}
