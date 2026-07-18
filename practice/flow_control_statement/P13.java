// Write a program to print prime numbers between 10 and 99.

public class P13 {
    public static void main(String[] args) {

        for (int num = 10; num <= 99; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}