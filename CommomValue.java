import java.util.ArrayList;
import java.util.Arrays;

 class CommonValue {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        
        int[] commonValues = findCommonValues(array1, array2);
        
        System.out.println("Common values between the arrays:");
        for (int num : commonValues) {
            System.out.println(num);
        }
    }
    
    public static int[] findCommonValues(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        ArrayList<Integer> commonValuesList = new ArrayList<>();
        
        int i = 0, j = 0;
        
        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                commonValuesList.add(array1[i]);
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        int[] commonValuesArray = new int[commonValuesList.size()];
        for (int k = 0; k < commonValuesList.size(); k++) {
            commonValuesArray[k] = commonValuesList.get(k);
        }
        
        return commonValuesArray;
    }
}