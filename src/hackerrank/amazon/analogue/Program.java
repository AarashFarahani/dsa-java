package hackerrank.amazon.analogue;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        var program = new Program();
//        System.out.println(program.countRangeSum(new int[]{-2,5,-1}, -2, 2));
        List<Integer> list = program.generateList(1000, 999999);
        Instant start = Instant.now();
        System.out.println(program.countRangeSum(list, -999999, 999999));
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(timeElapsed);

        System.out.println("*********************************************");

        var app = new App();
        start = Instant.now();
        System.out.println(app.calculateAnalogueDivide(list, -999999, 999999));
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(timeElapsed);
    }


    private List<Integer> generateList(int count, int upperBound) {
        var random = new Random();
        var list = new ArrayList<Integer>();

        for (int i = 0; i < count; i++) {
            var data = random.nextInt(upperBound);
            if(i % 3 == 0)
                data = data * -1;
            list.add(data);
        }

        return list;
    }

    public int countRangeSum(List<Integer> nums, int lower, int upper) {
        if (nums == null || nums.size() == 0) return 0;
        TreeMap<Long, Long> tr = new TreeMap<Long, Long>();
        tr.put((long) 0, (long) 1);
        long sum = 0;
        long count = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
            long from = sum - upper;
            long to = sum - lower;
            Map<Long, Long> sub = tr.subMap(from, true, to, true);
            for (Long value : sub.values()) {
                count += value;
            }
            if (tr.containsKey(sum)) {
                tr.put(sum, tr.get(sum) + 1);
            } else {
                tr.put(sum, (long) 1);
            }
        }
        return (int) count;
    }
}
