package datastructure.stack;

import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Arash");
        stack.push("Afshin");
        stack.push("Ali");

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
