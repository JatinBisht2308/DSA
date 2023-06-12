
import java.util.*;
// Q1)- Print numbers form 1 to n using recursion.
public class Rec1 {
    public static void main(String[] args) {
        System.out.println("Recursion 1 question");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number till u want to print the digits:");
        int n = scan.nextInt();
        oneToN(n,1);
    }
    public static void oneToN(int n,int s)
    {
//         base condition
        if(s>n)
        {
            return;
        }
        System.out.println(s);
        oneToN(n,s+1);
    }
}
