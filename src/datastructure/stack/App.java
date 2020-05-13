package datastructure.stack;

public class App {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        for (int i = 1; i < 5; i++) {
            stack.push(i);
        }

        for (int i = 1; i < 5; i++) {
            System.out.println(stack.pop());
        }

        System.out.println("**********************************************************");

        stack.push(2);
        stack.push(5);
        stack.push(7);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
