package algorithm.find.largest;

public class App {
    private final static int[] arr1 = {10, 20, 4};
    private final static int[] arr2 = {20, 10, 20, 4, 100};
    private final static int[] arr3 = {100, 30, 20, 10};

    public static void main(String[] args) {
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
    }

    private static int solution(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length / 2 + 1; i++) {
            if(arr[i] > max)
                max = arr[i];
            if(arr[arr.length - i] > max)
                max = arr[arr.length - i];
        }

        return max;
    }
}
