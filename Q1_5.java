package Chapter_1;

/**

 * Given 2 strings, check if they are 1 edit or 0 edits away.

   EXAMPLES:
      pale, ple -> true
      pales, pale, -> true
      pale, bale  -> true
      pale, bake -> false

 */

import java.util.Scanner;

public class Q1_5 {

    public static int checkEdits(String str1, String str2) {

        //local declaration
        int edits = 0, size = 0, matches = 0;
        boolean isFirstString = false;

        //find what string is longer and size
        if (str1.length() >= str2.length()) {

            size = str1.length();
            isFirstString = true;
        }

        else  {

            size = str2.length();
            isFirstString = false;
        }

        //check if 1 away from replace
        if (str1.length() == str2.length()) {

            int tempSize = size;

            for (int i = 0; i < tempSize; i++) {

                if (str1.charAt(i) == str2.charAt(i)) {

                    matches++;
                } else {

                    continue;
                }
            }

            int matchSize = str1.length() - 1;

            //check is matches are 1 less than size
            if (matches == matchSize) {

                edits++;
            }
        }

        //check if 1 away from remove
        if (isFirstString) {

            for (int i = 0; i < size; i++) {

                StringBuilder s1 = new StringBuilder(str1);
                s1 = s1.deleteCharAt(i);
                String temp = s1.toString();

                //match the strings
                if (temp.equals(str2)) {

                    edits++;
                    break;
                }

                else {

                    continue;
                }
            }
        }

        else {

            for (int i = 0; i < size; i++) {

                StringBuilder s2 = new StringBuilder(str2);
                s2 = s2.deleteCharAt(i);
                String temp = s2.toString();

                //match the strings
                if (temp.equals(str1)) {

                    edits++;
                    break;
                }

                else {

                    continue;
                }
            }
        }

        //check if 1 away from insert
        if (str1.length() == str2.length() +  1 || str2.length() == str1.length() +  1) {

            matches = 0;
            int tempSize = size - 1;
            for (int i = 0; i < tempSize; i++) {

                if (str1.charAt(i) == str2.charAt(i)) {

                    matches++;
                } else {

                    continue;
                }
            }
                int matchSize = str1.length();
                //check is matches are 1 less than size
                if (matches == matchSize) {

                    edits++;
                }


        }

        return edits;
    }

    public static void main(String q1_5 []) {

        //create a scanner
        Scanner s = new Scanner(System.in);

        //get data from user
        System.out.println("Enter 2 strings");
            String s1 = s.nextLine();
            String s2 = s.nextLine();

        //check edits & print result
        System.out.println("Edits: " + checkEdits(s1, s2));

        //close scanner
        s.close();
    }
}
