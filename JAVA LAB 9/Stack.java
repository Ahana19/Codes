public class Stack {
    private int[] elements;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        elements = new int[capacity];
        top = -1;
        this.capacity = capacity;
    }

    public void push(int element) throws StackFullException {
        if (top == capacity - 1) {
            throw new StackFullException("Stack is full");
        }
        elements[++top] = element;
    }

    public int pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return elements[top--];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.push(6); // This should throw a StackFullException
        } catch (StackFullException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop()); // This should throw a StackEmptyException
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}

class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}

class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}
