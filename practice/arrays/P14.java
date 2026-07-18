// Write a program to find the biggest number in a 3×3 array. The program is supposed to receive 9 integer numbers as command line arguments.

public class P14 {
    public static void main(String[] args) {

        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }
        int[][] arr = new int[3][3];
        int index = 0;
        int max;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[index++]);
            }
        }

        max = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nThe biggest number in the given array is " + max);
    }
}