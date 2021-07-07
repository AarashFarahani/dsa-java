package leetcode.plus.one;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        var app = new App();
        System.out.println(Arrays.toString(app.plusOne(new int[]{1, 2, 3})));        // 1,2,4
        System.out.println(Arrays.toString(app.plusOne(new int[]{4,3,2,1})));        // 4,3,2,2
        System.out.println(Arrays.toString(app.plusOne(new int[]{0})));        // 1
        System.out.println(Arrays.toString(app.plusOne(new int[]{9, 9, 9})));        // 1,0,0,0
    }

    public int[] plusOne(int[] digits) {
        int ex = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int result = digits[i] + ex;
            digits[i] = result % 10;
            ex = result / 10;
        }

        if (ex > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = ex;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }

            return result;
        }

        return digits;
    }
}
