package Chapter_2;

/**

    Write code to remove duplicates from an unsorted LinkedList.

 **/

import java.util.*;

public class Q2_1 {

    public static void main(String [] args) {


        LinkedList<String> list = new LinkedList();

        list.add("Dog");
        list.add("Apples");
        list.add("Peaches");
        list.add("Stick");
        list.add("Dog");
        list.add("Skeleton");
        list.add("Stick");

        //program
        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (i != j) {

                    if (list.get(i) == list.get(j)) {

                        list.remove(j);

                    }
                }
            }
        }
        System.out.println(list);
    }
}
