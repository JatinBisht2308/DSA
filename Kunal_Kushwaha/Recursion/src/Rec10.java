import java.util.*;
// Check whether an array is sorted or not using recursion.
public class Rec10 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = scan.nextInt();
        System.out.println("enter the array elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        if(isSorted(arr,0))
        {
            System.out.println("the array is sorted.");
        }
        else{
            System.out.println("the array is not sorted.");
        }
    }
    public static boolean isSorted(int[] arr, int index)
    {
//        base condition
        if(index == arr.length-1)
        {
            return true;
        }
        return arr[index] < arr[index+1] && isSorted(arr,index+1);
    }
}
