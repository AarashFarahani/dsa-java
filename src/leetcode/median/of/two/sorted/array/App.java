package leetcode.median.of.two.sorted.array;

import com.sun.jdi.connect.Connector;

import java.util.*;

public class App {
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}) == 2);
        System.out.println(app.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}) == 2.5);
        System.out.println(app.findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0}) == 0);
        System.out.println(app.findMedianSortedArrays(new int[]{}, new int[]{1}) == 1);
        System.out.println(app.findMedianSortedArrays(new int[]{2}, new int[]{}) == 2);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arrayLength = nums1.length + nums2.length;
        List<Integer> joinedList = new ArrayList<>();

        for (int item : nums1)
            joinedList.add(item);
        for (int item : nums2)
            joinedList.add(item);

        joinedList.sort(Comparator.comparingInt(a -> a));

        if(arrayLength % 2 == 1)
            return joinedList.get(arrayLength / 2);

        return (joinedList.get(arrayLength / 2) + joinedList.get(arrayLength / 2 - 1)) / 2D;
    }
}
