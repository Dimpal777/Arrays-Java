 class ArrayAverageCalculator {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};
        double average = calculateAverage(array);
        System.out.println("Average of the array elements: " + average);
    }
    
    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0; // Handling empty array case
        }
        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}