import java.util.*;
// Linear search using recursion.
public class Rec11 {
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
        System.out.println("enter the target element:");
        int target = scan.nextInt();
        System.out.println(isPresent(arr,target,0));
    }
    public static int isPresent(int[] arr,int target,int index)
    {
//        base condition
        if(index == arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        return isPresent(arr,target,index+1);
    }
}
