package ads.java;

public class ResizableArrayStack implements Stack {
    private int[] stackData;
    private int top; 

    public ResizableArrayStack() {
        stackData = new int[2];
        top = -1;
    }

    @Override
    public void push(int element) {
        if (top + 1 == stackData.length) {
            resize(stackData.length * 2);
        }
        stackData[++top] = element;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int result = stackData[top];
        stackData[top--] = 0; 

       
        if (top > 0 && top == stackData.length / 4) {
            resize(stackData.length / 2);
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    private void resize(int newCapacity) {
        int[] newStackData = new int[newCapacity];
        for (int i = 0; i <= top; i++) {
            newStackData[i] = stackData[i];
        }
        stackData = newStackData;
    }
}
