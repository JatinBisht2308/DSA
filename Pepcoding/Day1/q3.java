import java.util.*;
// Print all prime number till n.
public class q3{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int low = scan.nextInt();
    int high = scan.nextInt();
    for(int i=low;i<=high;i++)
      {
        if(checkIsPrime(i))
        {
          System.out.println(i);
        }
      }
  }
  public static Boolean checkIsPrime(int num)
  {
    for(int i=2;i<=num/2;i++)
      {
        if(num%i==0)
          return false;
      }
    return true;
  }
}