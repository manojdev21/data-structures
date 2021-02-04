package queue;

public class Queue {

    private int capacity;
    private int[] queue;
    private int size;
    int front;
    int rear;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
    }

    public void enQueue(int data) {

        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = data;
        rear = (rear + 1) % 5;
        size++;

    }

    public int deQueue() {

        int data = 0;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        data = queue[front];
        front = (front + 1) % 5;
        size--;
        return data;

    }

    public void show() {

        System.out.print("Elements: ");
        for (int i = 0; i < getSize(); i++) {
            System.out.print(queue[(front + i) % 5] + " ");
        }
        System.out.println();

    }

    public int getSize() {
        return size;
    }

    private boolean isEmpty() {
        return getSize() == 0;
    }

    private boolean isFull() {
        return getSize() == capacity;
    }

}
