import java.util.*;
// From here we will learn how to perform basic operations in linked list
public class LL1 {
    private Node head;
    private Node tail;
    private int size;
    public LL1()
    {
        this.size = 0;
    }
//    inserting element at the first position of the node
    public void insertionFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;
//         checking if there is only 1 element than both tail and head should point to the first element
         if(tail==null)
         {
             tail = head;
         }
         size+=1;
    }

   private class Node{
       private int val;
       private Node next;

       public Node(int value)
       {
           this.val = value;
       }
       public Node(int value, Node next)
       {
           this.val = value;
           this.next = next;
       }
   }
}
