import java.util.*;
// Reverse a number 
public class q7{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int num  = scan.nextInt();
    while(num!=0)
      {
        System.out.println(num%10);
        num/=10;
      }
  }
}