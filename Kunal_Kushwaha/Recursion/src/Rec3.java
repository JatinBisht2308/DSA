import java.util.*;
// Binary Search Algorithm using recursion
public class Rec3 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println(" enter the size of the array");
        int n = scan.nextInt();
        System.out.println(" enter the elements of the array:");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println("enter the target element:");
        int target = scan.nextInt();
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
    public static int binarySearch(int[] arr,int t,int s,int e)
    {
//        base condition
        if(s>e)
        {
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m]==t)
        {
            return m;
        }
        if(arr[m]>t) {
            return binarySearch(arr, t, s, m - 1);
        }
            return binarySearch(arr,t,m+1,e);
    }
}
