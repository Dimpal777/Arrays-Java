public class MinMaxArray {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 9, 1, 5};
        int[] minMax = findMinMax(array);
        
        System.out.println("Minimum value: " + minMax[0]);
        System.out.println("Maximum value: " + minMax[1]);
    }
    
    public static int[] findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        
        int min = array[0];
        int max = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        return new int[]{min, max};
    }
}