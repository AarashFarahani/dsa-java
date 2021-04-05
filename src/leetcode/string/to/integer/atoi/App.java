package leetcode.string.to.integer.atoi;

import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        System.out.println(new App().myAtoi("42")); //42
        System.out.println(new App().myAtoi("   -42")); //-42
        System.out.println(new App().myAtoi("4193 with words")); //4193
        System.out.println(new App().myAtoi("words and 987")); //0
        System.out.println(new App().myAtoi("-91283472332")); //-2147483648
        System.out.println(new App().myAtoi("3.14159")); //3
        System.out.println(new App().myAtoi("-+12")); //0
        System.out.println(new App().myAtoi("+1")); //1
        System.out.println(new App().myAtoi("  0000000000012345678")); //12345678
        System.out.println(new App().myAtoi("21474836460")); //2147483647
        System.out.println(new App().myAtoi("20000000000000000000")); //2147483647
    }

    public int myAtoi(String str) {
        int i = 0;
        int sign = 1;
        int result = 0;
        if (str.length() == 0) return 0;

        //Discard whitespaces in the beginning
        while (i < str.length() && str.charAt(i) == ' ')
            i++;

        // Check if optional sign if it exists
        if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-'))
            sign = (str.charAt(i++) == '-') ? -1 : 1;

        // Build the result and check for overflow/underflow condition
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (str.charAt(i++) - '0');
        }
        return result * sign;

    }

//    public int myAtoi(String s) {
//        boolean isNegative = false;
//        StringBuilder stringBuilder = new StringBuilder();
//        char[] chars = s.trim().toCharArray();
//        Pattern numberPattern = Pattern.compile("\\d+");
//        Pattern wholePattern = Pattern.compile("^(?!0)(\\d+)");
//        Pattern wordPattern = Pattern.compile("\\D+");
//
//        for (int i = 0; i < chars.length; i++) {
//            String str = stringBuilder.toString() + chars[i];
//
//            if(i == 0 && chars[i] == '-')
//                isNegative = true;
//            else if(i == 0 && chars[i] == '+')
//                continue;
//            else if(numberPattern.matcher(String.valueOf(chars[i])).find() && wholePattern.matcher(str).find())
//                stringBuilder.append(chars[i]);
//            else if(wordPattern.matcher(String.valueOf(chars[i])).find())
//                break;
//        }
//
//        String result = stringBuilder.toString();
//
//        if (result.length() == String.valueOf(Integer.MAX_VALUE).length()) {
//            if(isNegative)
//                return Integer.MIN_VALUE > -1 * Long.valueOf(result) ? Integer.MIN_VALUE : -1 * Long.valueOf(result).intValue();
//            else
//                return Integer.MAX_VALUE < Long.valueOf(result) ? Integer.MAX_VALUE : Long.valueOf(result).intValue();
//        } else if (result.length() > String.valueOf(Integer.MAX_VALUE).length()) {
//            if(isNegative)
//                return Integer.MIN_VALUE;
//            else
//                return Integer.MAX_VALUE;
//        } else if (result.length() == 0)
//            return 0;
//
//        return isNegative ? -1 * Integer.valueOf(result) : Integer.valueOf(result);
//    }
}
