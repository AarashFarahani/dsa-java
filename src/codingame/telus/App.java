package codingame.telus;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println(App.get(4, 2));  // 6
        System.out.println(App.get(5, 0));  // 1
        System.out.println(App.get(3, 1));  // 3
        System.out.println(App.get(4300, 2));  // 9242850
    }

    static String get(int l, int c) {
        List<Integer> line = new ArrayList<>();
        line.add(1);
        int r = 1;

        for(int i = 0; i < c; i++)
        {
            r = line.get(i) * (l-i) / (i+1);
            line.add(r);
        }
        return String.valueOf(r);
    }
//          Recursive
//    static String get(int l, int c) {
////        if(l == 0 || c == 0 || l == c)
////            return "1";
////
////        BigInteger result = new BigInteger(get(l - 1, c - 1))
////                .add(new BigInteger(get(l - 1, c)));
////        return result.toString();
//    }
}
