package leetcode.container.with.most.water;

public class App {
    private static int[] ARR1 = {1,8,6,2,5,4,8,3,7};

    public static void main(String[] args) {
        System.out.println(new App().maxArea(ARR1));
    }

    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int maxArea = 0;

        while (low < high) {
            int area = this.calculateArea(height, low, high);
            maxArea = area > maxArea ? area : maxArea;

            if(height[low] < height[high])
                low++;
            else
                high--;
        }

        return maxArea;
    }

    private int calculateArea(int[] height, int low, int high) {
        int minColumn = Math.min(height[low], height[high]);
        return (high - low) * minColumn;
    }
}
