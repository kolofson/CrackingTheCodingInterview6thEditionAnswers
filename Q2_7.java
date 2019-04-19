package Chapter_2;

/**

    Given two Linked Lists, determine if they intersect. Return the intersecting node.

    Therefore: If the kth node of the first list is in the exact same node in the second list, they intersect.

    **BY INDEX NOT VALUE

 */

import java.util.*;

public class Q2_7 {

    public static void main(String [] args) {

        boolean intersect = false;
        int node = 0;
        LinkedList<Integer> list_1 = new LinkedList();
        LinkedList<Integer> list_2 = new LinkedList();
        //first list
        list_1.add(7);
        list_1.add(2);
        list_1.add(45);
        list_1.add(3);
        //second list
        list_2.add(1);
        list_2.add(9);
        list_2.add(45);
        list_2.add(200);

        //program
        for (int i = 0; i < list_1.size(); i++) {

            if (list_1.get(i) == list_2.get(i)) {

                node = list_1.get(i);
                intersect = true;
                break;
            }

            else {

                intersect = false;
            }

        }

        if (intersect) {

            System.out.println("Intersecting node: " + node);
        }
    }
}
