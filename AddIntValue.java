public class AddIntValue {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};
        int sum = sumArray(array);
        System.out.println("Sum of the array elements: " + sum);
    }
    
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}