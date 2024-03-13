import java.util.Arrays;
import java.util.HashSet;

 class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 7, 3};
        int[] uniqueArray = removeDuplicates(array);
        
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
    
    public static int[] removeDuplicates(int[] array) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : array) {
            set.add(num);
        }
        
        // Convert the HashSet back to an array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }
        
        return uniqueArray;
    }
}