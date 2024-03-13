public class ArrayCopy {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];
        
        copyArray(sourceArray, destinationArray);
        
        // Print the copied array
        System.out.print("Copied array: ");
        for (int num : destinationArray) {
            System.out.print(num + " ");
        }
    }
    
    public static void copyArray(int[] source, int[] destination) {
        if (source.length != destination.length) {
            throw new IllegalArgumentException("Arrays must be of the same length");
        }
        
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }
}