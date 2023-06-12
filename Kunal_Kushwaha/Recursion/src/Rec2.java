import java.util.*;
// Print nth fibonacci number using recursion
public class Rec2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter the number:");
        int n = scan.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n)
    {
//         base condition
        if(n<2)
        {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
