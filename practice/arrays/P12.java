// Given 2 integer arrays, a and b, each of length 3, form a new array of length 2 containing their middle elements.

// Examples:

// middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
// middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
// middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]

public class P12 {
    public static void main(String[] args) {

        int[] a = {7, 7, 7};
        int[] b = {3, 8, 0};

        int[] result = {a[1], b[1]};
        System.out.print("Result Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}