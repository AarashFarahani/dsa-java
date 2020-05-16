package algorithm.firstnonerepeatingchar;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    private final static String STR1 = "AQIZQAZPN";

    public static void main(String[] args) {
        firstNoneRepeatingChar(STR1.toLowerCase());
    }

    private static void firstNoneRepeatingChar(String str) {
        int[] charCount = new int[26];
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            queue.add(currentChar);
            charCount[currentChar - 'a']++;

            while (!queue.isEmpty()) {
                if (charCount[queue.peek() - 'a'] > 1) {
                    queue.poll();
                } else {
                    System.out.print(queue.peek());
                    break;
                }
            }
        }
    }
}
