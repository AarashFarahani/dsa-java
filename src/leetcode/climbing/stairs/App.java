package leetcode.climbing.stairs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        var app = new App();
//        Set<int[]> set = new HashSet<>();
//        set.add(new int[]{1, 2, 3});
//        set.add(new int[]{1, 2, 3});
//        set.add(new int[]{1, 2, 3, 4});
//        set.add(new int[]{1, 2, 4});
//        set.forEach(a-> System.out.println(Arrays.toString(a)));
        System.out.println(app.climbStairs(2));             //  2
        System.out.println(app.climbStairs(3));             //  3
        System.out.println(app.climbStairs(4));             //  3
    }

    public int climbStairs(int n) {
        int a = 1, b = 1;
        while (n-- > 0)
            a = (b += a) - a;
        return a;
    }
}
