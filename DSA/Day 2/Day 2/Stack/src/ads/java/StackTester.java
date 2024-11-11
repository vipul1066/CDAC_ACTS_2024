package ads.java;

public class StackTester {
    public static void main(String[] args) {
        Stack stack = new ResizableArrayStack();
        System.out.println("Elements are push to stack");
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Elements are remove from stack");
        while (!stack.isEmpty()) {
            System.out.print( stack.pop() + " ");
        }

    }
}
