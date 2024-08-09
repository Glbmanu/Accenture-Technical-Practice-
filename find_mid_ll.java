import java.util.LinkedList;

public class find_mid_ll {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public static int fin_mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        find_mid_ll ll = new find_mid_ll();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);

        int a = fin_mid(head);
        System.out.println(a);
    }
}
