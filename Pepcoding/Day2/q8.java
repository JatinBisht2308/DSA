import java.util.*;
// Inverse of a number.
public class q8{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int count = 1;
    int ans = 0;
    while(num!=0)
      {
        int rem  = num%10;
        ans = ans + count * (int)Math.pow(10,rem-1);
        count++;
        num/=10;
      }
    System.out.println(ans);
  }
}