// B) Given two non-negative integer values, print true if they have the same last digit, otherwise print false.

import java.util.Scanner;

public class P1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % 10 == b % 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}