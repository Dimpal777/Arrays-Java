import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int position = 2; // Insert at position 2 (0-based indexing)
        
        int[] newArray = insertElement(array, elementToInsert, position);
        
        // Print the modified array
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }
    
    public static int[] insertElement(int[] array, int element, int position) {
        if (position < 0 || position > array.length) {
            throw new IllegalArgumentException("Invalid position");
        }
        
        int[] newArray = new int[array.length + 1];
        
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = element;
            } else {
                newArray[i] = array[j++];
            }
        }
        
        return newArray;
    }
}