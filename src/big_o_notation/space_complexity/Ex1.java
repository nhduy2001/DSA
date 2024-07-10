package big_o_notation.space_complexity;

public class Ex1 {
    void boooooo(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println("boooo!");
        }
    } // Only once do we store a value for a variable in memory at int i = 0 => O(1)

    String[] arrayOfHiTimes(int[] n) {
        String[] hiArray = new String[n.length];
        for (int i = 0; i < n.length; i++) {
            hiArray[i] = "hi";
        }
        return hiArray;
    } // hiArray stores value many times, so space complexity is O(n)
}
