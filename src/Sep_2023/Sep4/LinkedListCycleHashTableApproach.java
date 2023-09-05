package Sep_2023.Sep4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleHashTableApproach {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> visitedNodes = new HashSet<ListNode>(Arrays.asList(head));
        if(head!=null) {
            while (head.next != null) {
                if (!visitedNodes.add(head.next)) {
                    return true;
                }
                head = head.next;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode secondNode = new ListNode(2);
        ListNode firstNode = new ListNode(1);
        firstNode.next = secondNode;
        LinkedListCycleHashTableApproach linkedListCycleHashTableApproach = new LinkedListCycleHashTableApproach();
        System.out.println(linkedListCycleHashTableApproach.hasCycle(firstNode));
    }
}
