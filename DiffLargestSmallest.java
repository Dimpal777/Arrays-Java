import java.util.Arrays;

 class DifferenceLargestSmallest {
    public static void main(String[] args) {
        int[] array = {4, 9, 2, 7, 5, 1, 6, 3, 8};
        int difference = getDifferenceLargestSmallest(array);
        
        System.out.println("Difference between largest and smallest value: " + difference);
    }
    
    public static int getDifferenceLargestSmallest(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
        
        Arrays.sort(array); 
        
        int smallest = array[0]; 
        int largest = array[array.length - 1]; 
        
        return largest - smallest; 
    }
}