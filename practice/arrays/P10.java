// Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

public class P10 {
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }
        
        System.out.print("Result Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}