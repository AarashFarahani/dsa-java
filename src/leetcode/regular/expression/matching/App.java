package leetcode.regular.expression.matching;

public class App {
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.isMatch("aa", "a"));    //false
        System.out.println(app.isMatch("aa", "a*"));    //true
        System.out.println(app.isMatch("ab", ".*"));    //true
        System.out.println(app.isMatch("aab", "c*a*b"));    //true
        System.out.println(app.isMatch("mississippi", "mis*is*p*."));    //false
    }

    public boolean isMatch(String s, String p) {
        if (p == null || p.isBlank()) {
            return s.length() == 0;
        } else if (p.length() == 1 || p.charAt(1) != '*') {
            if (s == null || s.isEmpty()) {
                return false;
            } else if (s.charAt(0) != p.charAt(0) && p.charAt(0) != '.') {
                return false;
            } else {
                return this.isMatch(s.substring(1), p.substring(1));
            }
        } else {
            if (this.isMatch(s, p.substring(2))) {
                return true;
            }

            int i = 0;
            while (i < s.length() && (s.charAt(i) == p.charAt(0) || p.charAt(0) == '.')) {
                if (this.isMatch(s.substring(i + 1), p.substring(2))) {
                    return true;
                }

                i++;
            }

            return false;
        }
    }
}
