package leetcode.remove.element;

public class App {
    public static void main(String[] args) {
        var app = new App();

        var nums = new int[]{3,2,2,3};
        System.out.println(app.removeElement(nums, 3));             //  2

        nums = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(app.removeElement(nums, 2));             //  5
    }

    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0)
            return 0;

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            } else {
                nums[i] = -1;
            }
        }

        return index;
    }
}
