package Chapter_1;

/**

 PROMPT: Given 2 strings, write a method to decide if one is a permutation of the other.

 **/

import java.util.Scanner;

public class Q1_2 {

    public static boolean checkPermutation(String string1, String string2) {

        boolean isPermutation = false;

        int s1Size = string1.length();
        int s2Size = string2.length();

        if (s1Size != s2Size) {

            isPermutation = false;

        }

        //check using algorithm
        else {

          for (int i = 0; i < s1Size; i++) {

              String temp = string1.valueOf(string1.charAt(i));

              if (string2.contains(temp)) {

                  isPermutation = true;
                  continue;
              }

              else {

                  isPermutation = false;
                  break;
              }
          }
        }

        return isPermutation;
    }

    public static void main(String q1_2 []) {

        //create scanner
        Scanner s = new Scanner(System.in);

        //get data from user
        System.out.println("Please enter 2 strings");
            String s1 = s.nextLine();
            String s2 = s.nextLine();

        //check for permutation
        if (checkPermutation(s1, s2)) {

            System.out.println("These strings are a permutation of each other.");
        }

        else {

            System.out.println("These strings are NOT a permutation of each other.");
        }

        //close scanner
        s.close();

    }
}
