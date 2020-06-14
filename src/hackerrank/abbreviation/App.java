package hackerrank.abbreviation;

public class App {
    public static void main(String[] args) {
        System.out.println(abbreviation("daBcd", "ABC"));
        System.out.println(abbreviation("JHMWY", "Pi"));
    }

    static String abbreviation(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (Character.toUpperCase(a.charAt(i)) == Character.toUpperCase(b.charAt(0))) {
                boolean isMatch = true;
                for (int j = 1; j < b.length(); j++) {
                    if (Character.toUpperCase(a.charAt(++i))
                            != Character.toUpperCase(b.charAt(j))) {
                        isMatch = false;
                    }
                }

                if(isMatch)
                    return "YES";
            }
        }

        return "NO";
    }
}
