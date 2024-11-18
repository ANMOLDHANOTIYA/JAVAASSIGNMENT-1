import java.util.Scanner;

public class QueueUsingArray {
    private int maxSize = 10;
    private int front = -1;
    private int rear = -1;
    private int[] queue = new int[maxSize];

    // Enqueue operation
    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue overflow.");
        } else {
            if (front == -1) front = 0;
            queue[++rear] = value;
            System.out.println(value + " added to queue.");
        }
    }

    // Dequeue operation
    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue underflow.");
        } else {
            System.out.println(queue[front++] + " removed from queue.");
        }
    }

    // Peek operation
    public void peek() {
        if (front != -1 && front <= rear) {
            System.out.println("Front element is " + queue[front]);
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingArray queue = new QueueUsingArray();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.peek();
        queue.dequeue();
        queue.peek();

        sc.close();
    }
}
