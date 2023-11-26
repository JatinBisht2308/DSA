import java.util.*;
// Is a number prime question
public class q2{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    for(int i=0;i<t;i++)
      {
        int n = scan.nextInt();
        String ans = checkIsPrime(n);
        System.out.println(ans);
      }
  }
  public static String checkIsPrime(int num)
  {
    for(int i=2;i<=num/2;i++)
      {
        if(num%i==0)
          return "Not Prime";
      }
    return "Prime";
  }
}