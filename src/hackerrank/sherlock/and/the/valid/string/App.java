package hackerrank.sherlock.and.the.valid.string;

public class App {
    public static void main(String[] args) {
        System.out.println(isValid("aabbcd"));              // NO
        System.out.println(isValid("aabbccddeefghi"));      // NO
        System.out.println(isValid("abcdefghhgfedecba"));   // YES
        System.out.println(isValid("aa"));   // YES
    }

    static String isValid(String s) {
        char latestChar = s.charAt(0);
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (latestChar == s.charAt(i)) {
                count++;
            } else {
                latestChar = s.charAt(i);
            }
        }

        return count > 1 ? "NO" : "YES";
    }
}
