import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array
        int[] array = {10, 20, 30, 40, 50};
        
        // Element to remove
        System.out.println("Enter the element to remove:");
        int elementToRemove = scanner.nextInt();
        
        // Remove element from array
        int[] newArray = removeElement(array, elementToRemove);
        
        if (newArray != null) {
            System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArray));
        } else {
            System.out.println("Element not found in the array.");
        }
        
        scanner.close();
    }
    
    public static int[] removeElement(int[] array, int element) {
        // Find index of element to remove
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                indexToRemove = i;
                break;
            }
        }
        
        if (indexToRemove == -1) {
            return null;
        }
        int[] newArray = new int[array.length - 1];
        
        
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexToRemove) {
                newArray[j++] = array[i];
            }
        }
        
        return newArray;
    }
}
