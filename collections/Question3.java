
/*
    Design a Data Structure SpecialStack that supports all the stack operations like
    push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack.
    (Expected complexity O(1))
 */
class Pair {
    private int first;
    private int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
class SpecialStack {
    Pair[] arr;
    int size;
    int index;
    int minSoFar;
    public SpecialStack(int size) {
        this.size = size;
        this.index = 0;
        this.minSoFar = Integer.MAX_VALUE;
        arr = new Pair[size];
    }
    public void push(int value) {
        if(index == size) {
            System.out.println("Stack is full... Can't add new value");
            return;
        }
        minSoFar = (index == 0) ? value : Math.min(minSoFar, value);
        arr[index] = new Pair(value, minSoFar);
        index++;
    }

    public void pop() {
        if(index==0) {
            System.out.println("Stack is already empty!!");
            return;
        }
        index--;
        if(index==0)
            minSoFar = Integer.MAX_VALUE;
        else
            minSoFar = arr[index-1].getSecond();
    }

    // not mentioned in the assignment but it's an important method on stack
    public int top() {
        if(index==0)
            throw new IllegalStateException("Stack is empty!!");
        return arr[index-1].getFirst();
    }
    public boolean isEmpty() {
        return index==0;
    }

    public boolean isFull() {
        return index==size;
    }

    public int getMin() {
        if(index==0)
            throw new IllegalStateException("Stack is empty, no minimum value!!");
        return arr[index-1].getSecond();
    }
}
public class Question3 {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack(5);

        stack.push(10);
        stack.push(5);
        stack.push(20);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.top());
    }
}
