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
//     inserting element at the last of the node
    public void insertionLast(int value)
    {
//       if the list is empty then
        if(tail==null)
        {
            insertionFirst(value);
        }
        else{
            //         if not
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size+=1;
        }

    }
//    inserting element at an particular position
    public void insertionSpecific(int value,int index)
    {
//        if the index at 0 then call the insertionFirst
        if(index == 0)
        {
            insertionFirst(value);
        }
        else {
            Node node = new Node(value);
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size += 1;
        }
    }
//  method to display all the elements in a list
    public void display()
    {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
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
