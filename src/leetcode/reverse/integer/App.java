package leetcode.reverse.integer;

public class App {
    private final static int NUM1 = 123;
    private final static int NUM2 = -123;
    private final static int NUM3 = 120;
    private final static int NUM4 = 1534236469;

    public static void main(String[] args) {
//        System.out.println(reverse(NUM1));
//        System.out.println(reverse(NUM2));
//        System.out.println(reverse(NUM3));
        System.out.println(reverse(NUM4));
    }

    private static int reverse(int x) {
        Long result = 0L;
        boolean isNegative = false;

        if (x < 0) {
            isNegative = true;
            x *= -1;
        }

        while (x / 10 > 0) {
            result = (result * 10) + x % 10;
            x /= 10;
        }

        result = result * 10 + x;

        if (isNegative)
            result *= -1;

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0;

        return result.intValue();
    }
}
