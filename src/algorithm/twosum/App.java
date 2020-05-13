package algorithm.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class App {

    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 4, 8};
        int target = 7;
        Arrays.stream(solution(nums, target))
                .forEach(a-> System.out.println(a));
    }

    private static int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if(result.containsKey(delta))
                return new int[] { result.get(delta), i };

            result.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }
}
