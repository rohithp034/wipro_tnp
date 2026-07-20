import java.util.*;

public class Main {

    public static ArrayList<String> stringOperations(String s1, String s2) {
        ArrayList<String> result = new ArrayList<>();

        // 1. Replace all occurrences of S1 with S2
        result.add(s1.replace(s1, s2));

        // 2. If S2 appears more than once, replace last occurrence with reverse(S2)
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != -1 && first != last) {
            String rev = new StringBuilder(s2).reverse().toString();
            String op2 = s1.substring(0, last) + rev + s1.substring(last + s2.length());
            result.add(op2);
        } else {
            result.add(s1 + s2);
        }

        // 3. If S2 appears more than once, delete first occurrence
        if (first != -1 && first != last) {
            String op3 = s1.substring(0, first) + s1.substring(first + s2.length());
            result.add(op3);
        } else {
            result.add(s1);
        }

        // 4. Divide S2 into two halves and add second half to end of S1
        int n = s2.length();
        int mid = (n % 2 == 0) ? n / 2 : (n / 2) + 1;

        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);

        String op4 = firstHalf + s1 + secondHalf;
        result.add(op4);

        // 5. Replace characters in S1 that are present in S2 with '*'
        StringBuilder op5 = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) != -1)
                op5.append('*');
            else
                op5.append(c);
        }
        result.add(op5.toString());

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        ArrayList<String> ans = stringOperations(s1, s2);

        System.out.println(ans);
    }
}