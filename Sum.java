//calculating the sum of all
//numbers from 1 to n by recursion

package CodingChallenge;

public class Sum {
    public static int sum(int n) {
        // Base case: if n is 1, the sum is 1
        if (n == 1) {
            return 1;
        } else {
            // Recursive case: n + sum of n-1
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("The sum of 1 to 10 is " + result);
    }
}