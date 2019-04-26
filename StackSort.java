package Chapter_3.Question5;

/**

    Write a program to sort a stack such that the smallest element items are on the top. You can use an
    additional temporary stack, but you may not copy the elements into any other data structure (ex. array)

    The stack supports the following operations:
        - push
        - pop
        - peek
        - isEmpty

**/

import java.util.*;

public class StackSort {

    public static Stack<Integer> organizeStack(Stack<Integer> stack) {

        Stack<Integer> temp = new Stack();
        while (!stack.isEmpty()) {

            int val = stack.pop();

            while(!temp.isEmpty() && temp.peek() > val) {

                stack.push(temp.pop());
            }
            temp.push(val);
        }

        return temp;
    }

    public static void main (String []args) {

        Stack<Integer> stack = new Stack();

        stack.push(54);
        stack.push(78);
        stack.push(-5);
        stack.push(24);
        stack.push(0);
        stack.push(90);
        stack.push(13);

        //show original stack
        System.out.println("Original Stack: " + stack);
        //perform algorithm
        Stack<Integer> sortedStack = organizeStack(stack);
        //show result
        System.out.println("Sorted Stack: " + sortedStack);

    }
}
