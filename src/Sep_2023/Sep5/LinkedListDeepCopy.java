package Sep_2023.Sep5;

public class LinkedListDeepCopy {

    public Node copyRandomList(Node head) {

        Node curr = head;
        while (curr != null) {
            Node new_node = new Node(curr.val, curr.next);
            curr.next = new_node;
            curr = new_node.next;
        }

        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next != null ? curr.next.next : null;
        }

        Node old_head = head;
        Node new_head = head.next;
        Node curr_old = old_head;
        Node curr_new = new_head;

        while (curr_old != null) {
            curr_old.next = curr_old.next.next;
            curr_new.next = curr_new.next != null ? curr_new.next.next : null;
            curr_old = curr_old.next;
            curr_new = curr_new.next;
        }

        return new_head;
    }
    public static void main(String[] args) {
//        Node n3 = new Node(3);
//        Node n2 = new Node(3);
//        Node n1 = new Node(3);
//        n1.next = n2;
//        n2.next = n3;
//        n2.random = n1;
        Node n2 = new Node(2, null);
        Node n1 = new Node(1, n2);
        n1.random = n2;
        n2.random = n2;
        LinkedListDeepCopy linkedListDeepCopy = new LinkedListDeepCopy();
        System.out.println(linkedListDeepCopy.copyRandomList(n1));
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
        this.random = null;
    }
}