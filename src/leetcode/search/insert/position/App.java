package leetcode.search.insert.position;

public class App {
    public static void main(String[] args) {
        var app = new App();
        System.out.println(app.searchInsert(new int[]{1,3,5,6}, 5));         // 2
        System.out.println(app.searchInsert(new int[]{1,3,5,6}, 2));         // 1
        System.out.println(app.searchInsert(new int[]{1,3,5,6}, 7));         // 4
        System.out.println(app.searchInsert(new int[]{1,3,5,6}, 0));         // 0
        System.out.println(app.searchInsert(new int[]{1}, 0));               // 0
    }

    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}
