package hackerrank.even.sort.array;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println(moves(Arrays.asList(13, 10, 21, 20))); //  20 10 21 13  * result: 1
        System.out.println(moves(Arrays.asList(8, 5, 11, 4, 6))); //  8 6 4 11 5  * result: 2
        System.out.println(moves(Arrays.asList(5, 8, 5, 11, 4, 6))); // 6 8 4 11 5  * result: 2
    }

    public static int moves(List<Integer> arr) {
        // Write your code here
        int result = 0;
        for (int i = 0; i < arr.size() / 2 + 1; i++) {
            if (arr.get(i) % 2 != 0) {
                for (int j = arr.size() - 1; j >= arr.size() / 2; j--) {
                    if (arr.get(j) % 2 == 0) {
                        int temp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                        result++;
                        break;
                    }
                }
            }
        }

        return result;
    }
}
