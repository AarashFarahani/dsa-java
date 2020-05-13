package algorithm.romatointegernumeral;

import java.util.HashMap;
import java.util.Map;

public class App {
    private final static String num1 = "XL"; //40
    private final static String num2 = "MCMIV"; // 1904
    private final static String num3 = "XXIV"; // 24
    private final static String num4 = "CCCXXIV"; // 324
    private final static String num5 = "MMCCCXXIV"; // 2324
    private final static String num6 = "CIV"; // 104
    private final static String num7 = "XX"; // 20

    private final static Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        init();
        System.out.println(romanToInt(num1));
        System.out.println(romanToInt(num2));
        System.out.println(romanToInt(num3));
        System.out.println(romanToInt(num4));
        System.out.println(romanToInt(num5));
        System.out.println(romanToInt(num6));
        System.out.println(romanToInt(num7));
    }

    private static int romanToInt(String s) {
        int result = 0;
        int p = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= p) {
                result += map.get(s.charAt(i));
            } else {
                result -= map.get(s.charAt(i));
            }

            p = map.get(s.charAt(i));
        }

        return result;
    }

    private static void init() {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
}
