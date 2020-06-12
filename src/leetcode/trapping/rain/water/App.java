package leetcode.trapping.rain.water;

public class App {
    private static final int[] IN1 = { 0,1,0,2,1,0,1,3,2,1,2,1 };

    public static void main(String[] args) {
        System.out.println(new App().trap(IN1));
    }

    public int trap(int[] height) {
        int left = 0, leftMax = 0, ans = 0, rightMax = 0;
        int right = height.length - 1;

        while (left < right) {
            if (height[left] < height[right]) {
                if(height[left] >= leftMax)
                    leftMax = height[left];
                else
                    ans += (leftMax - height[left]);
                ++left;
            }
            else {
                if(height[right] >= rightMax)
                    rightMax = height[right];
                else
                    ans += (rightMax - height[right]);
                --right;
            }
        }

        return ans;
    }
}
