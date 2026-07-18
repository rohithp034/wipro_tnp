// Write a program to initialize an array and print them in a sorted order.

public class P6 {
    public static void main(String[] args) {

        int[] arr = {45, 12, 78, 3, 56, 89, 23, 7};
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }       
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}