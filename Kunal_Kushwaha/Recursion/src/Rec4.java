// Print number for n to 1 using recursion
import java.util.*;
public class Rec4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter the number:");
        int n = scan.nextInt();
        print(n);
    }
    public  static void print(int n)
    {
// base condition
if(n==0)
{
    return ;
}
        System.out.println(n);
print(n-1);
    }
}
