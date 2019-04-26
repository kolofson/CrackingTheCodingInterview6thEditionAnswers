package Chapter_3.Question2;

import java.util.Stack;

public class sideClass {

    Stack<Integer> s;
    sideClass() {
        s = new Stack();
    }

    void min() {

        int node = s.pop();

        while(!s.isEmpty()) {

            int node2 = s.pop();

            if (node2 < node) {

                node = node2;
                continue;
            }

            else {
                continue;
            }

        }
        System.out.println("Min " + node);
    }

    void push(int obj) {

        s.push(obj);
    }

    void pop() {

        s.pop();
    }
}
