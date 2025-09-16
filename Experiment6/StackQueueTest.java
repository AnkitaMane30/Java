package Experiment6;

import java.util.Scanner;

public class StackQueueTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackQueue sq = new StackQueue(10); // arrays of size 10
        int choice, value;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Push (Stack)");
            System.out.println("2. Pop (Stack)");
            System.out.println("3. Peek (Stack)");
            System.out.println("4. Display Stack");
            System.out.println("5. Enqueue (Queue)");
            System.out.println("6. Dequeue (Queue)");
            System.out.println("7. Display Queue");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    sq.push(value);
                    break;
                case 2:
                    System.out.println("Popped: " + sq.pop());
                    break;
                case 3:
                    System.out.println("Top element: " + sq.peek());
                    break;
                case 4:
                    sq.displayStack();
                    break;
                case 5:
                    System.out.print("Enter value to enqueue: ");
                    value = sc.nextInt();
                    sq.enqueue(value);
                    break;
                case 6:
                    System.out.println("Dequeued: " + sq.dequeue());
                    break;
                case 7:
                    sq.displayQueue();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}

