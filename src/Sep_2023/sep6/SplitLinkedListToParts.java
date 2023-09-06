package Sep_2023.sep6;

public class SplitLinkedListToParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] splitArray = new ListNode[k];
        int size = 0;
        ListNode current = head;
        while (current!=null){
            size++;
            current = current.next;
        }
        int q = size / k;
        int r = size % k;
        current = head;
        if(q==0){
            while (r!=0){
                splitArray[size-r] = new ListNode(current.val);
                current = current.next;
                r--;
            }
        }else {
            int i =0;
            while (k != 0) {
                int temp = r>0 ? q+1 : q;
                ListNode nodeToAdd = new ListNode(current.val);
                current = current.next;
                temp--;
                ListNode nodeToAddCopy = nodeToAdd;
                while (temp!=0) {
                    nodeToAdd.next = new ListNode(current.val);;
                    nodeToAdd = nodeToAdd.next;
                    current = current.next;
                    temp--;
                }
                splitArray[i] = nodeToAddCopy;
                i++;
                r--;
                k--;
            }
        }
        return splitArray;
    }

    public static void main(String[] args) {
//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(3);
//        n1.next = n2;
//        n2.next = n3;
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
//        ListNode n8 = new ListNode(8);
//        ListNode n9 = new ListNode(9);
//        ListNode n10 = new ListNode(10);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
//        n7.next = n8;
//        n8.next = n9;
//        n9.next = n10;
        SplitLinkedListToParts splitLinkedListToParts = new SplitLinkedListToParts();
        System.out.println(splitLinkedListToParts.splitListToParts(n1,3));
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }