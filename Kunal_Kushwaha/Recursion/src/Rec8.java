 import java.util.*;
// Check if a number is palindrome or not using recursion.
public class Rec8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = scan.nextInt();
        if(n==checkPalindrome(n,0))
        {
            System.out.println("Yes it is palindrome");
        }
        else{
            System.out.println("No its not a palindrome.");
        }

    }
    public static int checkPalindrome(int n,int sum)
    {
//         base condition
        if(n==0)
        {
            return sum;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        return checkPalindrome(n/10,sum);
    }
}
