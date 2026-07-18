// Write a program to receive a color code from the user (an alphabet).

// The program should print the corresponding color name based on the given color code.

// The color codes are:

// R → Red
// B → Blue
// G → Green
// O → Orange
// Y → Yellow
// W → White

// If the color code entered by the user is not valid, print Invalid Code.

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char code = Character.toUpperCase(sc.next().charAt(0));

        switch (code) {
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
        }

        sc.close();
    }
}