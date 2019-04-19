package Chapter_2;

/**

    Implement an algorithm to find the kth to last element of a linked list.

 */

import java.util.*;

public class Q2_2 {

    public static void main(String [] args) {

        LinkedList<Integer> list = new LinkedList();
        Scanner s = new Scanner(System.in);

        list.add(2);
        list.add(400);
        list.add(64);
        list.add(235);
        list.add(999999);

        System.out.println("Enter k");
            int k = s.nextInt();

       int index = list.size() - k;
       System.out.println(list.get(index));
    }
}
