package hackerrank.amazon.analogue;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        var app = new App();

//        System.out.println(app.calculateAnalogue(List.of(-2, 3, -3, 6), 1, 8));
        List<Integer> list = app.generateList(1000, 2000);
        Instant start = Instant.now();
        System.out.println(app.calculateAnalogue(list, -999999, 999999));
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(timeElapsed);

        System.out.println("*********************************************");
        start = Instant.now();
        System.out.println(app.calculateAnalogueDivide(list, -999999, 999999));
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(timeElapsed);

//        System.out.println("*********************************************");
//        start = Instant.now();
//        System.out.println(app.calculateAnalogue(list, -999999, 999999));
//        finish = Instant.now();
//        timeElapsed = Duration.between(start, finish).toMillis();
//        System.out.println(timeElapsed);
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

    protected int calculateAnalogueDivide(List<Integer> consecutive, int lowerBound, int upperBound) {
        int count = 0;
        for (int i = lowerBound, j = upperBound; i < j ; i++, j--) {
            count += count(i, consecutive, lowerBound, upperBound) + count(j, consecutive, lowerBound, upperBound);
//            if(isAnalogue(i, consecutive, lowerBound, upperBound)) {
//                count++;
//            }
        }

        return count;
    }

    private int calculateAnalogue(List<Integer> consecutive, int lowerBound, int upperBound) {
        int count = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if(isAnalogue(i, consecutive, lowerBound, upperBound)) {
                count++;
            }
        }

        return count;
    }

//    private int calculateAnalogueRecursive(int seed, int count, List<Integer> consecutive, int lowerBound, int upperBound) {
//        if(seed > upperBound || seed < lowerBound)
//            return count;
//
//        if(isAnalogue(seed, consecutive, lowerBound, upperBound))
//            return 1;
//
//        count += calculateAnalogueRecursive(seed + 1, count, consecutive, lowerBound, upperBound)
//                + calculateAnalogueRecursive(seed - 1, count, consecutive, lowerBound, upperBound );
//        return count;
//    }

    private int calculateAnalogueRecursive(List<Integer> consecutive, int lowerBound, int upperBound) {
        int count = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if(isAnalogue(i, consecutive, 0, lowerBound, upperBound) != null) {
                count++;
            }
        }

        return count;
    }

    private Integer isAnalogue(Integer seed, List<Integer> consecutive, int index, int lowerBound, int upperBound) {
        if(seed == null || seed < lowerBound || seed > upperBound)
            return null;

        if(index == consecutive.size())
            return seed;

        seed = seed - consecutive.get(index);
        return isAnalogue(seed, consecutive, ++index, lowerBound, upperBound);
    }

    private boolean isAnalogue(int seed, List<Integer> consecutive, int lowerBound, int upperBound) {
        int i;
        for (i = 0; i < consecutive.size(); i++) {
            seed = seed - consecutive.get(i);
            if (seed < lowerBound || seed > upperBound)
                return false;
        }

        return i == consecutive.size();
    }

    private int count(int seed, List<Integer> consecutive, int lowerBound, int upperBound) {
        int i;
        for (i = 0; i < consecutive.size(); i++) {
            seed = seed - consecutive.get(i);
            if (seed < lowerBound || seed > upperBound)
                return 0;
        }

        return i == consecutive.size() ? 1 : 0;
    }
}
