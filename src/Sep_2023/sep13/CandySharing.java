package Sep_2023.sep13;

public class CandySharing {
    public int candy(int[] ratings) {
        int size = ratings.length;
        int up=0, down =0, peak =0,minCandyRequired = 1;
        for (int i = 1; i < size; i++) {
            if(ratings[i]>ratings[i-1]){
                up +=1;
                peak = up+1;
                down = 0;
                minCandyRequired += peak;
            } else if (ratings[i]==ratings[i-1]) {
                up =0;
                down =0;
                peak =0;
                minCandyRequired += 1;
            }else {
                up =0;
                down += 1;
                if(down<peak)
                    minCandyRequired += down;
                else
                    minCandyRequired += down+1;
            }
        }
        return minCandyRequired;
    }

    public static void main(String[] args) {
        CandySharing candySharing = new CandySharing();
        System.out.println(candySharing.candy(new int[]{1,2,6,5,4,3,2,1}));
    }
}
