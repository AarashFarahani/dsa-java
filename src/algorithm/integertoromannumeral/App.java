package algorithm.integertoromannumeral;

public class App {
    private final static String[] units = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
    private final static String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
    private final static String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
    private final static String[] thousands = { "", "M", "MM", "MMM" };

    public static void main(String[] args) {
        System.out.println(intToRoman(24));
        System.out.println(intToRoman(324));
        System.out.println(intToRoman(2324));
        System.out.println(intToRoman(104));
        System.out.println(intToRoman(20));
    }

    private static String intToRoman(int num) {
        return thousands[num / 1000]
                + hundreds[(num % 1000) / 100]
                + tens[(num % 100) / 10]
                + units[num % 10];
    }
}
