import java.util.Scanner;

public class ArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] array = {10, 20, 30, 40, 50};
        
        System.out.println("Enter the element to search:");
        int element = scanner.nextInt();
        
        int index = findElementIndex(array, element);
        
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
        
        scanner.close();
    }
    
    public static int findElementIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i; // Return index if element found
            }
        }
        return -1; // Return -1 if element not found
    }
}