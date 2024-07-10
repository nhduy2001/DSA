package big_o_notation.time_complexity;

public class Ex2 {
    void anotherFunChallenge (int input) {
        int a = 5; // O(1)
        int b = 10; // O(1)
        int c = 50; // O(1)

        for (int i = 0; i < input; i++) {
            int x = i + 1; // O(n)
            int y = i + 2; // O(n)
            int z = i + 3; // O(n)
        }

        for (int j = 0; j < input; j++) {
            int p = j * 2; // O(n)
            int q = j * 2; // O(n)
        }

        String whoAmI = "I don't know"; // O(1)
    }
    // Total: O(1+1+1+n+n+n+n+n+1) = O(4 + 5n) = O(n)
}
