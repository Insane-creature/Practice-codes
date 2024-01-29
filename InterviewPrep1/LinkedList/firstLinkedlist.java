class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };
public class firstLinkedlist {
    public static Node constructLL(int []arr) {
        // Write your code here
        Node head = new Node(arr[0]);
        Node nexthead = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            nexthead.next = temp;
            nexthead = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,1,5};
        System.out.println(constructLL(arr));
    }
}