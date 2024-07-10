package data_structure.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurringCharacter {
    public static void main(String[] args) {
        int[] array1 = {2,5,1,2,3,5,1,2,4};
        int[] array2 = {2,1,1,2,3,5,1,2,4};
        int[] array3 = {2,3,4,5};

        System.out.println(firstRecurringCharacter(array1));
        System.out.println(firstRecurringCharacter(array2));
        System.out.println(firstRecurringCharacter(array3));
    }

    static Object firstRecurringCharacter (int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                return i;
            }
        }
        return null;
    }
}