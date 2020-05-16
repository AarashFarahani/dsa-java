package java8.sort;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 2, 1, 9, 4, 5 };
        Arrays.stream(arr).sorted().forEach(a-> System.out.println(a));
    }
}
