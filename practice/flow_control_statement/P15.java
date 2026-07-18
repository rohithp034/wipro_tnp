// Write a program to print * in Floyd's format (using a for loop).

// If no command line argument is given, print:

// Please enter an integer number
// Otherwise, print the * pattern for the given number of rows.



public class P15 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            return;
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}