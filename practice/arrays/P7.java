// Write a program to remove the duplicate elements in an array and print the same.

public class P7 {
    public static void main(String[] args) {
        
        int[] arr = {12, 34, 12, 45, 67, 89};

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}