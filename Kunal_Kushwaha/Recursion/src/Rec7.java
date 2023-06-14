import java.util.*;
// reverse a number using recursion
public class Rec7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = scan.nextInt();
        System.out.println(reverse(n,0));

    }
    public static int reverse(int num,int sum)
    {
//        base condition
        if(num==0)
        {
            return sum;
        }
//        creating the remainder
        int rem = num%10;
        sum = sum*10 + rem;
        return reverse(num/10,sum);
    }
}
