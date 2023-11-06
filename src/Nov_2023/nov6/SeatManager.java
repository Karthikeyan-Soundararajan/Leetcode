package Nov_2023.nov6;

import java.util.PriorityQueue;

public class SeatManager {

    private int last = 0;
    private PriorityQueue<Integer> priorityQueue;

    public SeatManager(int n) {
        priorityQueue = new PriorityQueue<>();
    }

    public int reserve() {
        if(priorityQueue.isEmpty()){
            return ++last;
        }else {
            return priorityQueue.poll();
        }
    }

    public void unreserve(int seatNumber) {
        if (seatNumber==last){
            last--;
        }else {
            priorityQueue.offer(seatNumber);
        }
    }

    public static void main(String[] args) {
        SeatManager seatManager = new SeatManager(5);
        seatManager.reserve();
        seatManager.reserve();
        seatManager.reserve();
        seatManager.reserve();
        seatManager.unreserve(4);
        seatManager.unreserve(3);
        seatManager.reserve();
        seatManager.reserve();
        seatManager.unreserve(5);
    }
}
