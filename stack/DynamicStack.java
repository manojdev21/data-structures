package stack;

public class DynamicStack {

    private int capacity = 1;
    private int[] stack = new int[capacity];
    private int top = 0;

    public void push(int data) {
        if (size() == capacity) extend();
        stack[top++] = data;
    }

    public int pop() {

        int data = 0;
        try {
            data = stack[--top];
            stack[top] = 0;
            if (size() <= capacity / 2) shrink();
        } catch (Exception e) {
            System.out.println("Stack Underflow!");
        }
        return data;

    }

    private void shrink() {
        int[] tempStack = new int[capacity /= 2];
        copyArrayData(tempStack);
        stack = tempStack;
        tempStack = null;
    }

    public int peek() {
        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public void show() {

        if (isEmpty()) System.out.println("Stack has no elements");

        for (int i = stack.length - 1; i >= 0; i--) { // change size() to stack.length for more understandability
            System.out.println("  " + stack[i] + "  ");
            System.out.println("|____| " + i + "\n");
        }

    }

    private void extend() {
        int[] tempStack = new int[capacity *= 2];
        copyArrayData(tempStack);
        tempStack = null;
    }

    private void copyArrayData(int[] temp) {
        for (int i = 0; i < size(); i++) {
            temp[i] = stack[i];
        }
        stack = temp;
        temp = null;
    }

}
