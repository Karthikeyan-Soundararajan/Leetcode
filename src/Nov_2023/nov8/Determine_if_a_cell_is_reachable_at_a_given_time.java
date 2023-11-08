package Nov_2023.nov8;

public class Determine_if_a_cell_is_reachable_at_a_given_time {

    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx==fx && sy==fy){
            if(t==1)
                return false;
        }
        return t >= Math.max(Math.abs(sx-fx),Math.abs(sy-fy));
    }

    public static void main(String[] args) {
        Determine_if_a_cell_is_reachable_at_a_given_time determineIfACellIsReachableAtAGivenTime = new Determine_if_a_cell_is_reachable_at_a_given_time();
        System.out.println(determineIfACellIsReachableAtAGivenTime.isReachableAtTime(3,1,7,3,3));
    }
}
