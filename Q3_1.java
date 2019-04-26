package Chapter_3.Question1;

/**

    Describe how you could use a single array to implement 3 stacks.

 */

import java.util.*;

public class Q3_1 {

    public static void main(String [] args) {

        Stack<Integer> stack_1 = new Stack();
        Stack<Integer> stack_2 = new Stack();
        Stack<Integer> stack_3 = new Stack();
        Scanner s = new Scanner(System.in);

        int array[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};

        //program
        int size = array.length / 3;
        //split into 3 equal parts
        for (int i = 0; i < array.length; i++) {

            if (i < size) {

                stack_1.push(array[i]);
            }

            else if (i >= size && i < size + size) {

                stack_2.push(array[i]);
            }

            else if (i >= size + size || i <= size) {

                stack_3.push(array[i]);
            }

        }

        System.out.println(stack_1);
        System.out.println(stack_2);
        System.out.println(stack_3);
    }
}
