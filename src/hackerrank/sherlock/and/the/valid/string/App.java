package hackerrank.sherlock.and.the.valid.string;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println(isValid("aabbcd"));              // NO
        System.out.println(isValid("aabbbccddeefghi"));      // NO
        System.out.println(isValid("abcdefghhgfedecba"));   // YES
        System.out.println(isValid("aa"));   // YES
    }

    static String isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.computeIfPresent(c, (k, v)-> v + 1);
            map.putIfAbsent(c, 1);
        }

        int firstCharCount = map.get(s.charAt(0));
        Long count = map.entrySet()
                .stream()
                .filter(e-> e.getValue() != firstCharCount)
                .count();
        return count > 1 ? "NO" : "YES";
    }
}
