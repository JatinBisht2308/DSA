import java.util.*;
// Print numbers from 1 to n using recursion

public class Rec5 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        System.out.println(" enter the number:");
        int n = scan.nextInt();
        print(n);
    }

    public static void print(int n) {
//         base condition
        if(n==0)
        {
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
