package how_to_solve_coding_problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BetterSolution {
    public static void main(String[] args) {
        // return false
        Character[] array1 = {'a', 'b', 'c', 'x'};
        Character[] array2 = {'z', 'y', 'i'};

        // return true
        Character[] array3 = {'a', 'b', 'c', 'x', 1};
        Character[] array4 = {'z', 'y', 1};

        System.out.println(betterSolution(array1, array2));
        System.out.println(betterSolution(array3, array4));
    }

    private static boolean betterSolution (Character[] arr1, Character[] arr2) {
        Set<Character> characters = new HashSet<>(Arrays.asList(arr1));
        for (char c : arr2) {
            if (characters.contains(c)) {
                return true;
            }
        }

        return false;
    }
}
