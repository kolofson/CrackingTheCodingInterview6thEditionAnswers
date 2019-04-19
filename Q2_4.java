package Chapter_2;

/**

  Write code to partition a linked list around a value x. nodes < x come after nodes >= x.
  if x is in list it goes after elements < x.

 */

import java.util.*;

public class Q2_4 {

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        LinkedList<Integer> original_list = new LinkedList();
        LinkedList<Integer> new_list = new LinkedList();
        original_list.add(3);
        original_list.add(5);
        original_list.add(8);
        original_list.add(5);
        original_list.add(10);
        original_list.add(2);
        original_list.add(1);

        System.out.println("Enter a partition");
        int x = s.nextInt();
        s.close();
        System.out.println("\nList: " + original_list);

        //program
        for (int i = 0; i < original_list.size(); i++) {

            if (original_list.get(i) == x) {

                new_list.addLast(original_list.get(i));

            }

            else if (original_list.get(i) < x) {

                new_list.addFirst(original_list.get(i));
            }

            else {

                int y = new_list.indexOf(x);
                new_list.add(y, original_list.get(i));
            }
        }

        System.out.println(new_list);
    }
}