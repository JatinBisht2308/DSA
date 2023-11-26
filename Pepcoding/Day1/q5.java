import java.util.*;
// Count digits in a number
public class q5{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int count =0;
    while(num!=0)
      {
        count++;
        num/=10;
      }
    System.out.println(count);
  }
}