
// Selection sorting -> steps and rule
public class selection {
   public static void main(String[] args) {
      int[] arr = { 14, 33, 27, 10, 35, 19, 42, 44 };
      selectionSort(arr);
      for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
      }
   }

   public static void selectionSort(int[] arr) {
      for (int i = 0; i < arr.length-2; i++) {
         int min = i;
         for (int j = i+1; j < arr.length; j++) {
            if(arr[j]<arr[i])
            {
               min = j;
            }
         }
         // swapping arr[i] with the smalles element found so far
         int temp = arr[i];
         arr[i] = arr[min];
         arr[min] = temp; 
      }
   }

}
