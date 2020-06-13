package hackerrank.arrays.left.rotation;

import java.util.Arrays;

public class App {
    private final static int[] ARR1 = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        var answer = rotLeft(ARR1, 4);
        Arrays.stream(answer).forEach(a-> System.out.print(String.format("%s ", a)));
    }

    static int[] rotLeft(int[] a, int d) {
        int[] answer = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            answer[(i + a.length - d) % a.length] = a[i];
        }

        return answer;
    }
}
