
// Program to get the nth fibonacci number after calculating the formula for it using linear reccurrence relation steps
import java.util.Scanner;

public class tc1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        getFib(n);
        scan.close();

    }

    public static void getFib(int n) {
        // formula that i got is (given below)
        int num = (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));//this is correct
        // int num = (int) (Math.pow(1.61,n)/2.13);//this is approx answer
        System.out.println(num);
    }
}