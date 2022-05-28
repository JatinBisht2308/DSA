// Program to get the nth fibonacci number after calculating the formula for it using linear reccurrence relation steps
import java.util.Scanner;
public class tc1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        getFib(n);
        scan.close();

    }
    public static void getFib(int n){
    //     formula that i got is (1.68^n)
    long num = (long)Math.pow(1.68, n);
     System.out.println(num);
    }
}