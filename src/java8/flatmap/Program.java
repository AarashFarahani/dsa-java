package java8.flatmap;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Arrays.stream(data).flatMap(a -> Arrays.stream(a)).forEach(a -> System.out.println(a));

        System.out.println("****************************************************************");

        Integer[][] arr = {{2, 6, 12, 34},
                {1, 9, 20, 1000},
                {23, 34, 90, 2000}};

        Arrays.stream(arr).flatMap(a -> Arrays.stream(a)).sorted().forEach(a -> System.out.println(a));
    }
}
