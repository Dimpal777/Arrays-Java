 class MissingNumber {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5,6, 7, 8,9, 10};

        int missingNumber = findMissingNumber(sortedArray);
        System.out.println("Missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int expected = 1;
        for (int num : arr) {
            if (num != expected) {
                return expected;
            }
            expected++;
        }
        // If the loop completes, then no number is missing
        return -1; // or throw an exception
    }
}
