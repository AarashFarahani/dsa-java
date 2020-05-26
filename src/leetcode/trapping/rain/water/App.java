package leetcode.trapping.rain.water;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static final int[] IN1 = { 0,1,0,2,1,0,1,3,2,1,2,1 };

    private int capacity = 0;

    public static void main(String[] args) {
        System.out.println(new App().trap(IN1));
    }

    public int trap(int[] height) {
        int result = 0;

        for (int i = 0; i < height.length - 1; i++) {
            if (height[i] > 0) {
                int start = height[i];
//                int end = start;
                List<Integer> depth = new ArrayList<>();

                while (++i < height.length && height[i] < height[i + 1]) {
                    depth.add(height[i]);
                }

                int end = height[i--];
                int min = Math.min(start, end);
                int sum = depth.stream().mapToInt(a-> min - a).sum();
                result += sum;
            }
        }

        return result;
    }
}
