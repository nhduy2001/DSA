package data_structure.arrays;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Nguyen Hoang Duy";

        System.out.println(reverse(str));
    }

    static String reverse (String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
