package how_to_solve_coding_problems;

public class BruteForce {
    public static void main(String[] args) {
        // return false
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'z', 'y', 'i'};

        // return true
        char[] array3 = {'a', 'b', 'c', 'x'};
        char[] array4 = {'z', 'y', 'x'};

        System.out.println(bruteForce(array1, array2));
        System.out.println(bruteForce(array3, array4));

    }

    private static boolean bruteForce (char[] arr1, char[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
