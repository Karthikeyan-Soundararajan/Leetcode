package Sep_2023.Sep5;

public class LinkedListDeepCopy {

    public Node copyRandomList(Node head) {

        return head;
    }

    public static void main(String[] args) {

    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}