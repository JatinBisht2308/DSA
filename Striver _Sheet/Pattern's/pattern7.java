// Pattern 7 ->
//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *


import java.util.*;
public class pattern7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int spaces = n-1;
        int stars = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=stars;k++)
            {
                System.out.print("*");
            }
            spaces--;
            stars+=2;
            System.out.println();
        }
    }
}
