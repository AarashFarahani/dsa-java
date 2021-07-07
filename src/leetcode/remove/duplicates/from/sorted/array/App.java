package leetcode.remove.duplicates.from.sorted.array;

public class App {
    public static void main(String[] args) {
        var app = new App();
        System.out.println(app.removeDuplicates(new int[]{1,1,2}));                     //  2
        System.out.println(app.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));       //  5
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        return i;
    }
}
