package stack;

public class Stack {

    private static final int FIXED_CAPACITY = 10;
    private int[] stack = new int[FIXED_CAPACITY];
    private int top = 0;

    public void push(int data) {
        stack[top++] = data;
    }

    public int pop() {
        int data = stack[--top];
        stack[top] = 0;
        return data;
    }

    public int peek() {
        return stack[top - 1];
    }

    public void show() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println("  " + stack[i] + "  ");
            System.out.println("|____| " + i + "\n");
        }
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

}
