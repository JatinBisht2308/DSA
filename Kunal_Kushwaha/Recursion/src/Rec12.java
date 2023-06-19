import java.util.*;
// Return the array list without passing list in the arguments for findAllIndex question using recursion
public class Rec12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        System.out.println(findAllIndex(arr,target,0));
    }
    public static ArrayList<Integer> findAllIndex(int[] arr, int target,int index)
    {
        ArrayList<Integer> list= new ArrayList<>();
        if(index == arr.length)
        {
            return list;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        ArrayList<Integer> listFromNextCall = findAllIndex(arr, target, index+1);
        list.addAll(listFromNextCall);
        return list;
    }
}
