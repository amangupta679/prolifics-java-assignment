package July5year2023;

public class Q2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.peek();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.peek();
    }
}

class Stack {
    private int[] arr;
    private int size;
    private int ptr = -1;

//    Default Const
    Stack () {
        this.size = 5;
        this.arr = new int[5];
    }

    // if user give size

    Stack (int size) {
        this.size = size;
        this.arr = new int[size];
    }

    // push

    public void push (int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            ptr = ptr + 1;
            arr[ptr] = data;
        }
    }

    // check for stack overflow

    private boolean isFull () {
        if (ptr == arr.length-1)
            return true;
        else
            return false;
    }

    // pop method

    public void pop () {
        if (isEmpty())
            System.out.println("Stack Underflow");
        else {
            System.out.println(arr[ptr]);
            ptr = ptr - 1;
        }
    }

    // check stack is underflow

    private boolean isEmpty () {
        if (ptr == -1)
            return true;
        else
            return false;
    }
    public void peek () {
        if (isEmpty()) {
            System.out.println("Can't peek empty stack");
        } else {
            System.out.println("peek :- "+arr[ptr]);
        }
    }
}
