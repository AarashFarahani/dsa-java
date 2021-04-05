package leetcode.zigzag.conversion;

import java.util.Arrays;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.convert("ABCDEFGH", 2).equals("ACEGBDFH"));
        System.out.println(app.convert("PAYPALISHIRING", 3).equals("PAHNAPLSIIGYIR"));
        System.out.println(app.convert("PAYPALISHIRING", 4).equals("PINALSIGYAHRPI"));
    }

    public String convert(String s, int numRows) {
        if(numRows <= 1)
            return s;

        char[] chars = s.toCharArray();

        // Find length of string
        int len = chars.length;

        // Create an array of
        // strings for all n rows
        String[] arr = new String[numRows];
        Arrays.fill(arr, "");

        // Initialize index for
        // array of strings arr[]
        int row = 0;
        boolean down = true; // True if we are moving
        // down in rows, else false

//        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < len; ++i)
        {
            // append current character
            // to current row
            arr[row] += (chars[i]);

            // If last row is reached,
            // change direction to 'up'
            if (row == numRows - 1)
            {
                down = false;
            }

            // If 1st row is reached,
            // change direction to 'down'
            else if (row == 0)
            {
                down = true;
            }

            // If direction is down,
            // increment, else decrement
            if (down)
            {
                row++;
            }
            else
            {
                row--;
            }
        }

        String result = Arrays.stream(arr).flatMap(Stream::of)
                .reduce((a, b)-> a + b).get();
        return result;
    }
}
