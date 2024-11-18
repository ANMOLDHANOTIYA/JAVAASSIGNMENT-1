import java.util.Scanner;

public class StackUsingArray {
    private int maxSize = 10;
    private int top = -1;
    private int[] stack = new int[maxSize];

    // Push operation
    public void push(int value) {
        if (top < maxSize - 1) {
            stack[++top] = value;
            System.out.println(value + " pushed to stack.");
        } else {
            System.out.println("Stack overflow.");
        }
    }

    // Pop operation
    public void pop() {
        if (top >= 0) {
            System.out.println(stack[top--] + " popped from stack.");
        } else {
            System.out.println("Stack underflow.");
        }
    }

    // Peek operation
    public void peek() {
        if (top >= 0) {
            System.out.println("Top element is " + stack[top]);
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingArray stack = new StackUsingArray();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();
        stack.pop();
        stack.peek();

        sc.close();
    }
}
