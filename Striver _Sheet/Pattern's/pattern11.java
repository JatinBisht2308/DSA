// Pattern 11->
// 1      1
// 12    21
// 123  321
// 12344321

public class pattern11 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++) {
            for(int left = 1;left<=i;left++)
            {
                System.out.print(left);
            }
            for(int spaces=1;spaces<=((n*2)-(i*2));spaces++)
            {
                System.out.print(" ");
            }
            for(int right = i;right>=1;right--)
            {
                System.out.print(right);
            }
            System.out.println();
        }
    }
}
