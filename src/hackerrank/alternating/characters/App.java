package hackerrank.alternating.characters;

public class App {
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAA"));      // 3
        System.out.println(alternatingCharacters("BBBBB"));     // 4
        System.out.println(alternatingCharacters("ABABABAB"));  // 0
        System.out.println(alternatingCharacters("BABABA"));    // 0
        System.out.println(alternatingCharacters("AAABBB"));    // 4
    }

    static int alternatingCharacters(String s) {
        char latestChar = s.charAt(0);
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (latestChar == s.charAt(i)) {
                count++;
            } else
                latestChar = s.charAt(i);
        }

        return count;
    }
}
