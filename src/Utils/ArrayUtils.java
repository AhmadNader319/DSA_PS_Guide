package Utils;
import java.util.*;
import java.util.stream.IntStream;

public class ArrayUtils {

    public int getFirst(int[] arr){
        return arr[0];
    }
    public int getLast(int[] arr){
        return arr[arr.length-1];
    }
    public int getAt(int[] arr, int index){
        return arr[index];
    }
    public int[] setAtFirst(int[] arr, int value){
        int[] newArr = new int[arr.length+1];
        newArr[0] = value;
        for (int i = 0; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }
        return newArr;
    }
    public int[] InsertAtIndex(int[] arr, int value, int index){
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index]=value;
        for (int i = index+1; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public int[] removeAtIndex(int[] arr, int index){
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index+1; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    // 1. In-Place Reversal
    public void reverseInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // 2. In-Place Reversal with Copy
    public int[] reverseInPlaceCopy(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length); // Create a copy of the original array
        int left = 0;
        int right = copy.length - 1;
        while (left < right) {
            int temp = copy[left];
            copy[left] = copy[right];
            copy[right] = temp;
            left++;
            right--;
        }
        return copy; // Return the reversed copy
    }

    // 3. Non-In-Place Reversal (New Array)
    public int[] reverseToNewArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - i - 1];
        }
        return newArr; // Returns a new array that is the reverse of the original
    }

    // 4. Reversal with Collections.reverse()
    public Integer[] reverseWithCollections(Integer[] arr) {
        Integer[] copy = arr.clone(); // Clone the array to avoid modifying the original
        List<Integer> list = Arrays.asList(copy);
        Collections.reverse(list);
        return list.toArray(new Integer[0]); // Return the reversed array
    }

    // 5. Reversal with Stream API
    public int[] reverseWithStream(int[] arr) {
        return IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - i - 1])
                .toArray();
    }

    // Method to perform Bubble Sort
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Loop through all elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
    // Method to perform Insertion Sort
    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


}
