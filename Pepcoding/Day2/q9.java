import java.util.*;
// Rotate a number
public class q9{
  public static void main(String[] args)
  {
     Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int k = scan.nextInt();
    int count = (Integer.toString(num)).length();
    k=k%count;
    if(k<0)
    {
      k=count + k;
    }
    int div = 1;
    int mul = 1;
    for(int i=1;i<=count;i++)
      {
        if(k>0)
        {
          div = div*10;
          k--;
        }
        else{
          mul = mul * 10;
        }
      }
    int q = num/div;
    int rem = num%div;
    int ans = (rem * mul) + q;
    System.out.println(ans);
  }
}