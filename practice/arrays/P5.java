// Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

public class P5 {
    public static void main(String[] args) {

       
        int[] arr = {45, 12, 78, 3, 56, 89, 23, 7};

        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        int smallest1 = Integer.MAX_VALUE;
        int smallest2 = Integer.MAX_VALUE;

        for (int num : arr) {

            
            if (num > largest1) {
                largest2 = largest1;
                largest1 = num;
            } else if (num > largest2) {
                largest2 = num;
            }

            if (num < smallest1) {
                smallest2 = smallest1;
                smallest1 = num;
            } else if (num < smallest2) {
                smallest2 = num;
            }
        }

        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nLargest Number = " + largest1);
        System.out.println("Second Largest Number = " + largest2);
        System.out.println("Smallest Number = " + smallest1);
        System.out.println("Second Smallest Number = " + smallest2);
    }
}