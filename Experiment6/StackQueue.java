package Experiment6;

public class StackQueue implements StackInterface, QueueInterface {
    private int[] stackArr;
    private int top;
    private int stackSize;

    private int[] queueArr;
    private int front, rear, queueSize;

    // Constructor
    public StackQueue(int size) {
        stackSize = size;
        stackArr = new int[stackSize];
        top = -1;

        queueSize = size;
        queueArr = new int[queueSize];
        front = -1;
        rear = -1;
    }

    // ----- Stack methods -----
    @Override
    public void push(int value) {
        if (top == stackSize - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stackArr[++top] = value;
        System.out.println(value + " pushed to stack");
    }

    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stackArr[top--];
    }

    @Override
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stackArr[top];
    }

    @Override
    public void displayStack() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArr[i] + " ");
        }
        System.out.println();
    }

    // ----- Queue methods -----
    @Override
    public void enqueue(int value) {
        if (rear == queueSize - 1) {
            System.out.println("Queue Overflow!");
            return;
        }
        if (front == -1) front = 0;
        queueArr[++rear] = value;
        System.out.println(value + " enqueued to queue");
    }

    @Override
    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        return queueArr[front++];
    }

    @Override
    public void displayQueue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArr[i] + " ");
        }
        System.out.println();
    }
}

