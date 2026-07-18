// Write a program to print the sum of the elements of an array following the given below condition.

// If the array has 6 and 7 in succeeding order, ignore the numbers between 6 and 7 and consider the other numbers for calculation of the sum.

public class P8 {
    public static void main(String[] args) {

        int[] arr = {10, 3, 6, 1, 2, 7, 9};
        int sum = 0;
        boolean ignore = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                ignore = true;
                continue;
            }
            if (ignore) {
                if (arr[i] == 7) {
                    ignore = false;
                }
                continue;
            }
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}