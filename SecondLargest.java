public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 5, 9, 2, 8};
        int secondLargest = findSecondLargest(array);
        
        System.out.println("Second largest number in the array: " + secondLargest);
    }
    
    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        return secondLargest;
    }
}
