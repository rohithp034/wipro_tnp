// Write a program to initialize an integer array and print the sum and average of the array.

public class P1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
    }
}