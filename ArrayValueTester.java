import java.util.Scanner;

public class ArrayValueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] array = {10, 20, 30, 40, 50};
        
        
        System.out.println("Enter the value to test:");
        int value = scanner.nextInt();
        
        
        boolean containsValue = contains(array, value);
        
        if (containsValue) {
            System.out.println("The array contains the value " + value);
        } else {
            System.out.println("The array does not contain the value " + value);
        }
        
        scanner.close();
    }
    
    public static boolean contains(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true; // Return true if value found in array
            }
        }
        return false; // Return false if value not found in array
    }
}
