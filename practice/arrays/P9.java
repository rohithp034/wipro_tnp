// Print a version of the given array where all the 10s have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. You may modify and display the given array or make a new array.

public class P9 {
    public static void main(String[] args) {

        int[] arr = {1, 10, 10, 2};
        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                result[index++] = arr[i];
            }
        }
                
        System.out.print("Result Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}