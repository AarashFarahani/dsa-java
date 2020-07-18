package hackerrank.newyear.chaos;

public class App {
    public static void main(String[] args) {
        minimumBribes(new int[] { 2, 1, 5, 3, 4 }); //  3
        minimumBribes(new int[] { 2, 5, 1, 3, 4 }); //  Too chaotic

        minimumBribes(new int[] { 5, 1, 2, 3, 7, 8, 6, 4 });    //  Too chaotic
        minimumBribes(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });    //  0
        minimumBribes(new int[] { 1, 2, 5, 3, 7, 8, 6, 4 });    //  7

        minimumBribes(new int[] { 1, 2, 5, 3, 4, 7, 8, 6 }); // 4
    }

    static void minimumBribes(int[] q) {
        int bribes = 0;

        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if(q[j] > q[i])
                    bribes++;
            }
        }

        System.out.println(bribes);
    }
}
