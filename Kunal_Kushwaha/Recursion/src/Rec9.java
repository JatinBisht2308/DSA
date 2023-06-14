import java.util.*;
// Count the number of zeros in an number
public class Rec9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number to count zeros:");
        int n = scan.nextInt();
        if(n==0)
        {
            System.out.println(" there are 1 zeros in number "+n);
        }
        else {
            System.out.println("There are " + countZeros(n, 0) + " zeros in " + n + ".");
        }
    }
    public static int countZeros(int n,int count)
    {
//         base conditions
         if(n==0)
         {
             return count;
         }
         int rem = n%10;
         if(rem==0)
             count++;
         return countZeros(n/10,count);
    }
}
