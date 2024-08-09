public class tree_inorder {
   static class Node{
        int data;
        Node left;
        Node right;
        Node (int d){
            data = d;
        }
    }
    static void inOrder(Node root){
       if(root == null) return;
       inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    static  void preOrder(Node root){
       if(root == null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
       if(root == null) return;
       postOrder(root.left);
       postOrder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(30);
        root.right = new Node(50);
        root.left.left = new Node(25);
        root.left.right = new Node (35);
        root.left.left.left = new Node(15);
        root.left.left.right = new Node(28);
        root.right.left = new Node(45);
        root.right.right = new Node(60);
        root.right.right.left = new Node(55);
        root. right.right.right = new Node (70);
       // inOrder(root);
      //  preOrder(root);
        postOrder(root);
    }
}
