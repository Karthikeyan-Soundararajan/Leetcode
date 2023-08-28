package Aug_2023.aug28;

import java.util.*;
import java.util.stream.Collectors;

public class MyStack {

    private LinkedList<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        for (int i = 0; i < queue.size()-1; i++) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
         MyStack obj = new MyStack();
         obj.push(1);
         obj.push(2);
         obj.push(3);
         int param_1 = obj.pop();
         int param_2 = obj.pop();
         int param_3 = obj.pop();

    }
}
