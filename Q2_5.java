package Chapter_2;

/**

    You have two numbers represented by a linked list, where each node contains a single digit. The digits are
    stored in REVERSE ORDER. Write a function that adds the two numbers and returns the sum as a linked list.

    EXAMPLE:

        I/P: (7 -> 1 -> 6) + (5 -> 9 -> 2) That is, 617 + 295.

        O/P: (2 -> 1 -> 9) That is, 912.

 */

import java.util.*;

public class Q2_5 {

    public static void main(String args []) {

        LinkedList<Integer> list = new LinkedList();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter n1");
            int n1 = s.nextInt();
        System.out.println("Enter n2");
            int n2 = s.nextInt();

        String num_2 = Integer.toString(n2);
        String num_1 = Integer.toString(n1);

        for (int i = 0; i < num_1.length(); i++) {

            String val = num_1.valueOf(num_1.charAt(i));
            int new_val = Integer.parseInt(val);

            if (i == 0) {

                list.add(new_val);
            }

            else {

                list.addFirst(new_val);
            }
        }

        for (int i = 0; i < num_2.length(); i++) {

            String val = num_2.valueOf(num_2.charAt(i));
            int new_val = Integer.parseInt(val);

            if (i == 0) {

                list.addFirst(new_val);
            }

            else {

                list.addFirst(new_val);
            }

        }

        //SUM
        String x1 = "", x2 = "";
        //get first val
        for (int i = 0; i < num_1.length(); i++) {

            x1 += Integer.toString(list.get(i));
        }
        //get second val
        for (int i = num_1.length(); i < list.size(); i++) {

            x2 += Integer.toString(list.get(i));
        }

        int finalSum = Integer.parseInt(x1) + Integer.parseInt(x2);

        System.out.println(x1 + " + " + x2 + " is " + finalSum);
        s.close();
    }
}
