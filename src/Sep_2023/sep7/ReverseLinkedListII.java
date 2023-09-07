package Sep_2023.sep7;

import java.util.Stack;

public class ReverseLinkedListII {

//    public ListNode reverseBetween2(ListNode head, int left, int right) {
//        int listSize = 0;
//        ListNode current = head;
//        while (current!=null){
//            listSize++;
//            current = current.next;
//        }
//        current = head;
//        Stack<ListNode> listNodeStack = new Stack<>();
//        int i =1;
//        while (i<=right){
//            if(i>=left){
//                ListNode newNode = new ListNode(current.val);
//                listNodeStack.add(newNode);
//            }
//            i++;
//            current = current.next;
//        }
//        ListNode reversedInbetween = listNodeStack.pop();
//        ListNode nodeForTraversal = reversedInbetween;
//        while (!listNodeStack.isEmpty()){
//            nodeForTraversal.next = listNodeStack.pop();
//            nodeForTraversal = nodeForTraversal.next;
//        }
//        current = head;
//        ListNode reversedNode = null;
//        ListNode currentreversedNode = reversedNode;
//        for (int j = 1; j < listSize; j++) {
//            if(j==left){
//
//            }
//            if (j<left || j>right){
//
//            }
//        }
//        return head;
//    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current = head;
        Stack<ListNode> reversedNode = new Stack<ListNode>();
        int listSize = 1;
        ListNode reversedLinkedList = new ListNode();
        ListNode currentReversed = reversedLinkedList;
        while (current!=null){
            if (left <= listSize && listSize <= right ){
                reversedNode.add(new ListNode(current.val));
            }else {
                if (listSize==right+1){
                    ListNode reversedInbetween = reversedNode.pop();
                    ListNode nodeForTraversal = reversedInbetween;
                    while (!reversedNode.isEmpty()){
                        nodeForTraversal.next = reversedNode.pop();
                        nodeForTraversal = nodeForTraversal.next;
                    }
                    currentReversed.next = reversedInbetween;
                    currentReversed = nodeForTraversal;
                }
                currentReversed.next = new ListNode(current.val);
                currentReversed = currentReversed.next;
            }
            current = current.next;
            listSize++;
        }
        if(!reversedNode.isEmpty()){
            ListNode reversedInbetween = reversedNode.pop();
            ListNode nodeForTraversal = reversedInbetween;
            while (!reversedNode.isEmpty()){
                nodeForTraversal.next = reversedNode.pop();
                nodeForTraversal = nodeForTraversal.next;
            }
            currentReversed.next = reversedInbetween;
        }
        return reversedLinkedList.next;
    }

    public static void main(String[] args) {
//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(3);
//        ListNode n4 = new ListNode(4);
//        ListNode n5 = new ListNode(5);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
        ListNode n1 = new ListNode(5);
        ReverseLinkedListII reverseLinkedListII = new ReverseLinkedListII();
        System.out.println(reverseLinkedListII.reverseBetween(n1,1,1));
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }