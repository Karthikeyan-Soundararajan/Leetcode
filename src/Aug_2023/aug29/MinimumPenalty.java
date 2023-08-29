package Aug_2023.aug29;

public class MinimumPenalty {

    public int bestClosingTime(String customers) {
        int totalPenalties = 0;
        for (int i = 0; i < customers.length(); i++) {
            if(customers.charAt(i)=='Y')
                totalPenalties++;
        }
        int currentPenalty = totalPenalties;
        int bestClosingTime = 0;
        for (int i = 1; i < customers.length(); i++) {
            char ch = customers.charAt(i);
            if(ch == 'Y'){
                currentPenalty--;
            }else{
                currentPenalty++;
            }
            if(currentPenalty<totalPenalties){
                totalPenalties = currentPenalty;
                bestClosingTime = i+1;
            }
        }
        return bestClosingTime;
    }

    public static void main(String[] args) {
        MinimumPenalty minimumPenalty = new MinimumPenalty();
        System.out.println(minimumPenalty.bestClosingTime("YN"));
    }
}