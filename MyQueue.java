package Chapter_3.Question4;

/**

    Implement a MyQueue class which implements a queue using two stacks.

**/

import java.util.*;

public class MyQueue {

    public static class StackQueue<T> {

        private Stack<T> inbox = new Stack<T>();
        private Stack<T> outbox = new Stack<T>();

        public void push(T obj) {
            inbox.push(obj);
        }

        public T pop() {
            if (outbox.isEmpty()) {
                if (inbox.isEmpty()) {
                    return null;
                }
                while (!inbox.isEmpty()) {
                    outbox.push(inbox.pop());
                }
            }
            return outbox.pop();
        }
    }

    public static void main(String [] args) {

        StackQueue<Integer> q = new StackQueue();
        q.push(5);
        q.push(100);
        System.out.println(q.inbox);
        q.pop();
        System.out.println(q.inbox);
    }
}
