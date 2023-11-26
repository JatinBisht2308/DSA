import java.util.*;
// Print all fibonacci numbers till N
public class q4{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    int num1 = 0;
    int num2 = 1;
    System.out.print(num1 + " " + num2+ " ");
    for(int i=1;i<=t-2;i++)
      {
        int num3 = num1 + num2;
        System.out.print(num3+" ");
        num1 = num2;
        num2 = num3;
      }
  }
}