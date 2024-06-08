import java.io.*;
public class Main {
   //main method
   public static void main(String[] args) {
      // The array elements
      int arr[] = { 10, 2, 3};
      System.out.println("The subarrays are-");
         
      // Calling the recursive function
      printSubArrays(arr, 0, 0);
   }
   
   // Recursive FUnction to Find all the subarrays
   static void printSubArrays(int[] arr, int head, int tail) {
   
      // Exits the function if we have reached the end
      if (tail == arr.length)
         return;
      
      // Increases the first index and calls itself
      else if (head > tail)
         printSubArrays(arr, 0, tail + 1);
      
      // Print the subarray and then increases the first element index
      else {
         for (int i = head; i < tail; i++)
            System.out.print(arr[i] + " ");
         System.out.println(arr[tail]);
         printSubArrays(arr, head + 1, tail);
      }
      return;
   }
}
