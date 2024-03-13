public class ContainsElement {
    public static void main(String[] args) {
        int[] array = {10, 23, 5, 12, 17, 9};
        boolean containsBoth = containsElements(array, 12, 23);
        
        if (containsBoth) {
            System.out.println("The array contains both 12 and 23.");
        } else {
            System.out.println("The array does not contain both 12 and 23.");
        }
    }
    
    public static boolean containsElements(int[] array, int element1, int element2) {
        boolean containsElement1 = false;
        boolean containsElement2 = false;
        
        for (int num : array) {
            if (num == element1) {
                containsElement1 = true;
            } else if (num == element2) {
                containsElement2 = true;
            }
            
            if (containsElement1 && containsElement2) {
                return true;
            }
        }
        
        return false;
    }
}