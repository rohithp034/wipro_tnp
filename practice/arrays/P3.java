// Write a program to initialize an integer array with values and check if a given number is present in the array or not.

// If the number is not found, print -1.
// Otherwise, print the index value of the given number in the array.

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {


        int[] arr = {1, 4, 34, 56, 7};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }


        System.out.println(index);

        sc.close();
    }
}