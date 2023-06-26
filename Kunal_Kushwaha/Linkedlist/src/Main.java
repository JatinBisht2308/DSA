public class Main {
    public static void main(String[] args) {
      LL1 list = new LL1();
        System.out.println("insertion at first:");
      list.insertionFirst(5);
      list.insertionFirst(4);
        list.insertionFirst(3);
        list.insertionFirst(2);
        list.insertionFirst(1);
         list.display();
        System.out.println("insertion at last:");
      list.insertionLast(6);
      list.insertionLast(7);
      list.display();
      list.insertionSpecific(100,7);
      list.display();
    }
}
