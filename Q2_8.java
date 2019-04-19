package Chapter_2;

/**

    Given a circular LinkedList, implement an algorithm that returns the node at the beginning of the loop.

    Example:

        I/P: A -> B -> C -> D -> E -> C

        O/P: C

 */

import java.util.*;

public class Q2_8 {

    public static void main(String [] args) {

        LinkedList<String> alpha = new LinkedList();

        String node = "";
        alpha.add("A");
        alpha.add("B");
        alpha.add("C");
        alpha.add("D");
        alpha.add("E");
        alpha.add("C");

        //program
        for (int i = 0; i < alpha.size(); i++) {

            for (int j = i + 1; j < alpha.size(); j++) {

                if (alpha.get(i).equals(alpha.get(j))) {

                    node = alpha.get(i);
                }
            }
        }
        System.out.println("Repeated Node: " + node);
    }
}
