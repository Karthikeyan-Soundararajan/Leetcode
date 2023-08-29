package Aug_2023.aug29;

public class MinimumPenalty {

    public int bestClosingTime(String customers) {
        int closingTime = Integer.MAX_VALUE;
        int closingCost = Integer.MIN_VALUE;
        int closingPenalty = Integer.MAX_VALUE;
        for (int i = 0; i <customers.length()+1; i++) {
            int currentCost = 0, currentPenalty=0;
            for (int j = 0; j < i; j++) {
                if (customers.charAt(j)=='N'){
                    currentPenalty++;
                }else {
                    currentCost++;
                }
            }
            for (int j = i; j < customers.length(); j++) {
                if (customers.charAt(j)=='Y') {
                    currentPenalty++;
                }
            }
            if(i == customers.length() + 1){
                if(customers.charAt(customers.length()) == 'Y')
                    currentPenalty++;
            }
            if(currentCost>closingCost){
                if (currentPenalty<closingPenalty){
                    closingCost = currentCost;
                    closingPenalty = currentPenalty;
                    closingTime = i;
                }
            }
        }
        return closingTime;
    }

    public static void main(String[] args) {
        MinimumPenalty minimumPenalty = new MinimumPenalty();
        System.out.println(minimumPenalty.bestClosingTime("NNN"));
    }
}
