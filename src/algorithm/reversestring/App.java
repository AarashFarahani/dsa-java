package algorithm.reversestring;

public class App {
    private final static String str1 = "Hello!!!";
    private final static String str2 = "Arash";

    public static void main(String[] args) {
        System.out.println(reverse(str1));
        System.out.println(reverse(str2));
    }

    private static String reverse(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

//    private static String reverse(String str) {
//        return new StringBuilder(str)
//                .reverse()
//                .toString();
//    }
}
