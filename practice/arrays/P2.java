// Write a program to initialize an integer array and find the maximum and minimum value of the array.

public class P2 {
    public static void main(String[] args) {
        
        int[] arr = {10, 25, 5, 40, 15};

        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nMaximum Value = " + max);
        System.out.println("Minimum Value = " + min);
    }
}