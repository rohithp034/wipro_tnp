// Given an array of type int, print true if every element is 1 or 4; otherwise, print false.

// Examples:

// only14([1, 4, 1, 4]) → true
// only14([1, 4, 2, 4]) → false
// only14([1, 1]) → true

public class P11 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 1, 4};
        boolean result = true;
       
        for (int num : arr) {
            if (num != 1 && num != 4) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}