  class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 1};
        int[] uniqueArr = removeDuplicates(arr);
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> uniqueList = new ArrayList<>();

        for (int value : arr) {
            if (!set.contains(value)) {
                set.add(value);
                uniqueList.add(value);
            }
        }

        // Convert list back to array
        int[] uniqueArr = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArr[i] = uniqueList.get(i);
        }

        return uniqueArr;
    }
}