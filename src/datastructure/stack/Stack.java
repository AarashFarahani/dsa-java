package datastructure.stack;

public class Stack {
    private int top;
    private final int capacity;
    private final int[] array;

    public Stack(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return this.array[top--];
    }

    public void push(int item) {
        if (this.isFull()) {
            throw new RuntimeException("Stack is full");
        }

        this.array[++top] = item;
    }

    public int peek() {
        return this.array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == this.capacity - 1;
    }
}
