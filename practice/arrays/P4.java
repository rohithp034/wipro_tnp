// Initialize an integer array with ASCII values and print the corresponding character values in a single row.


public class P4 {
    public static void main(String[] args) {

        int[] ascii = {65, 66, 67, 68, 69, 70, 97, 98, 99, 100};

        System.out.println("Corresponding Characters:");
        for (int i = 0; i < ascii.length; i++) {
            System.out.print((char) ascii[i] + " ");
        }
    }
}