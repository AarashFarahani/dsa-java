package algorithm.reversedigitofnumber;

public class App {
    private final static int num1 = 54321;
    private final static int num2 = 852147;

    public static void main(String[] args) {
        System.out.println(reverse(num1));
        System.out.println(reverse(num2));
    }

    private static int reverse(int num) {
        int reserved = 0;

        while (num != 0) {
            reserved = (reserved * 10) + (num % 10);
            num = num / 10;
        }

        return reserved;
    }
}
