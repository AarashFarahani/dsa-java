package algorithm.secondlargest;

public class App {
    private static final int[] arr1 = {10, 20, 4};
    private static final int[] arr2 = {70, 11, 20, 4, 100};

    public static void main(String[] args) {
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }

    private static int solution(int[] arr) {
        int max = Integer.max(arr[0], arr[1]);
        int secondMax = Integer.min(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                secondMax = max;
            } else if(arr[i] > secondMax && arr[i] != max)
                secondMax = arr[i];
            else
                if (max == secondMax)
                    secondMax = arr[i];
        }

        return secondMax;
    }
}
