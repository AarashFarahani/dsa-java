package leetcode.three.sum;

import java.util.*;

public class App {
    public static void main(String[] args) {
//        Set set = new HashSet();
//        set.add(List.of(1,2,3));
//        set.add(List.of(1,2,3));
//        set.forEach(a-> System.out.println(a));
//        System.out.println(set);
        var app = new App();
        System.out.println(app.threeSum(new int[]{-1,0,1,2,-1,-4}));   //[[-1,-1,2],[-1,0,1]]
//        System.out.println(app.threeSum(new int[]{}));   //[]
//        System.out.println(app.threeSum(new int[]{0}));   //[]
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        if(nums == null && nums.length==0)
            return new ArrayList<>(res);
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2;i++) {
            int j = i + 1;
            int k = nums.length-1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0)
                    res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if (sum > 0)
                    k--;
                else if (sum < 0)
                    j++;
            }

        }

        return new ArrayList<>(res);
    }
}
