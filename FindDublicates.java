import java.util.HashSet;

 class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};
        int[] duplicates = findDuplicates(array);
        
        System.out.println("Duplicate values in the array:");
        for (int num : duplicates) {
            System.out.println(num);
        }
    }
    
    public static int[] findDuplicates(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicatesSet = new HashSet<>();
        
        for (int num : array) {
            if (!set.add(num)) { // If element is already in the set, it's a duplicate
                duplicatesSet.add(num);
            }
        }
        
        // Convert set of duplicates to array
        int[] duplicatesArray = new int[duplicatesSet.size()];
        int index = 0;
        for (int num : duplicatesSet) {
            duplicatesArray[index++] = num;
        }
        
        return duplicatesArray;
    }
}