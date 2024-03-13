import java.util.Arrays;

public class ReverseArrayExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        
        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
    
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            // Swap elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            // Move start index forward and end index backward
            start++;
            end--;
        }
    }
}