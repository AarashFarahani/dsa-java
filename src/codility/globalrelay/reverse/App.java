package codility.globalrelay.reverse;

public class App {
    public static void main(String[] args) {
        System.out.println(reverse(2134));  // 4312
        System.out.println(reverse(-1234));  // -4321
    }

    private static int reverse(int number) {
        StringBuilder result = new StringBuilder();
        result.append(number);

        if (result.indexOf("-") != -1) {
            result.deleteCharAt(0);
            result.reverse();
            result.insert(0, "-");
        } else
            result.reverse();

        return Integer.valueOf(result.toString());
    }
}
