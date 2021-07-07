package leetcode.two.sumII;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        var app = new App();
        System.out.println(Arrays.toString(app.twoSum(new int[]{2,7,11,15}, 9)));    //  [1,2]
        System.out.println(Arrays.toString(app.twoSum(new int[]{2,3,4}, 6)));        //  [1,3]
        System.out.println(Arrays.toString(app.twoSum(new int[]{-1,0}, -1)));        //  [1,2]
    }

    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length <= 1)
            return new int[]{0, 0};

        int i = 0, j = numbers.length - 1;
        while (i <= j) {
            if ((numbers[i] + numbers[j]) == target) {
                return new int[]{i + 1, j + 1};
            }
            if((numbers[i] + numbers[j]) > target)
                j--;
            else
                i++;
        }

        return new int[]{0, 0};
    }
}
