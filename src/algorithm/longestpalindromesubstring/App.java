package algorithm.longestpalindromesubstring;

public class App {
    private final static String STR1 = "abccba";
    private final static String STR2 = "vabccbax";
    private final static String STR3 = "vacca";

    private int resultStart;
    private int resultLength;

    public static void main(String[] args) {
        System.out.println(new App().findPalindrome(STR1));
        System.out.println(new App().findPalindrome(STR2));
        System.out.println(new App().findPalindrome(STR3));
    }

    private String findPalindrome(String str) {
        int length = str.length();

        for (int i = 0; i < length; i++) {
            expandRange(str, i, i);
            expandRange(str, i, i + 1);
        }

        return str.substring(resultStart, resultStart + resultLength);
    }

    private void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length()
                && str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }

        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }
}
