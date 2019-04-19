package Chapter_2;

/**

    Implement an algorithm to delete a node in the middle.

 */

import java.util.*;

public class Q2_3 {

    public static void main(String [] k) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");

        //program

        int x = (list.size() - 1) / 2;

        System.out.println(list.get(x));


    }
}
