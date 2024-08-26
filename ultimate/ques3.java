
// Linked List Palindrome

package ultimate;
import java.util.Scanner;
import java.util.Stack;
public class ques3{
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
static Node head;
static Node tail;
public void  addlast(int data){
    Node newNode = new Node(data);
    if (head == null){
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;

}
public static boolean isPalindrome(Node head) {
    Stack<Integer> st = new Stack<>();
    Node temp = head;
    while (temp != null) {
        st.push(temp.data);
        temp = temp.next;
    }
    temp = head;
    while (temp != null) {
        if (temp.data != st.peek()) {
            return false;
        }
        st.pop();
        temp = temp.next;
    }
    return true;
}


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ques3 ll = new ques3();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        int a = sc.nextInt();
        ll.addlast(a);
    }
    System.out.println(isPalindrome(head));
}
}

