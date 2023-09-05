package Sep_2023.Sep4;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer!=null&&fastPointer.next!=null)
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer==fastPointer){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}


class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}