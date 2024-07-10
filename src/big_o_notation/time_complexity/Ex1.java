package big_o_notation.time_complexity;

public class Ex1 {
    void anotherFunction () {

    }
    int funChallenge (int[] input) {
        int a = 10; // O(1)
        a = 50 + 3; // O(1)

        for (int i = 0; i < input.length; i++) { // O(n)
            anotherFunction(); // O(n)
            boolean stranger = true; // O(n)
            a++; // O(n)
        }
        return a; // O(1)
    }
    // Total: O(1+1+n+n+n+n1) = O(3+4n) => O(n)
}
