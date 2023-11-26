import java.util.*;
// Prints digits of a number.
public class q6{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int count = countDigit(num);
    int div = (int)Math.pow(10,count-1);
    while(num!=0)
      {
        System.out.println(num/div);
        num%=div;
        div/=10;
      }
  }
  public static int countDigit(int num)
  {
    int count =0;
    while(num!=0)
      {
        count++;
        num/=10;
      }
    return count;
  }
}