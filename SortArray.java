public class Main
{
    public static void insert(int arr[], int temp, int idx){
        // Base case: Place temp if it's greater than or equal to the current element or we've reached the beginning
        if(idx == -1 || arr[idx] <= temp){
            arr[idx + 1] = temp;
            return;
        }
        // Shift the current element to the right
        arr[idx + 1] = arr[idx];
        // Recursively insert temp at its correct position
        insert(arr, temp, idx - 1);
    }

    public static void sort(int arr[], int idx){
        // Base case: if only one element is left, it's already sorted
        if(idx < 1){
            return;
        }
        sort(arr, idx - 1);
        int temp = arr[idx - 1];
        insert(arr, temp, idx - 2);
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 7, 3, 4};
        int n = arr.length;
        sort(arr, n);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}


//Sort ArrayList
import java.util.ArrayList;

public class Main {
    
    // Insert an element into the sorted list
    public static void insert(ArrayList<Integer> list, int element) {
        // Base case: if the list is empty or the last element is less than or equal to element
        if (list.size() == 0 || list.get(list.size() - 1) <= element) {
            list.add(element); // add element at the end
            return;
        }

        // Remove the last element and recursively insert the element
        int last = list.remove(list.size() - 1);
        insert(list, element);

        // After inserting element, add the last element back
        list.add(last);
    }

    // Recursive sort function for the ArrayList
    public static void sort(ArrayList<Integer> list) {
        // Base case: if the list has 1 or no element, it's already sorted
        if (list.size() <= 1) {
            return;
        }

        // Remove the last element
        int last = list.remove(list.size() - 1);

        // Recursively sort the remaining list
        sort(list);

        // Insert the last element into the sorted list
        insert(list, last);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(6);
        arr.add(7);
        arr.add(3);
        arr.add(4);

        // Call the recursive sort function
        sort(arr);

        // Print the sorted list
        System.out.println(arr);
    }
}

