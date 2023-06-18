import java.util.*;
// Linear search  and also find all index using recursion.
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
        System.out.println("Single index is:"+isPresent(arr,target,0));
        findAllIndex(arr,target,0);
        System.out.println("All index is:"+list.toString());

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
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] arr,int target,int index)
    {
//        base condition
        if(index==arr.length)
        {
            return;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

}
