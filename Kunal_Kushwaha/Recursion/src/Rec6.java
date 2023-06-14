import java.util.*;
// factorial of a number
public class Rec6 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = scan.nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n) {
//         base condition
        if(n<=1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}
