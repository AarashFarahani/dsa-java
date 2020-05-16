package datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Program {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add("Arash");
        queue.add("Afshin");
        queue.add("Ali");

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}
