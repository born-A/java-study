package prob5;

public class MyStack {
    private String[] stackArray;
    private int top;
    private int maxSize;

    public MyStack(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String s) throws MyStackException {
        if (isFull()) {
            resize();
        }
        top++;
        stackArray[top] = s;
    }

    private void resize() {
    	maxSize++;
    	String[] newArray = new String[maxSize];
    	for (int i = 0; i < stackArray.length; i++) {
            newArray[i] = stackArray[i];
        }
    	stackArray = newArray;
	}

	public String pop() throws MyStackException {
        if (isEmpty()) {
            throw new MyStackException("stack is empty");
        }
        String s = stackArray[top];
        top--;
        return s;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
