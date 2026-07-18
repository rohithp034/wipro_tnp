import java.util.Scanner;

public class P10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.next();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        String last = str.substring(str.length() - n);

        String result = "";

        for (int i = 0; i < n; i++) {
            result += last;
        }

        System.out.println(result);

        sc.close();
    }
}