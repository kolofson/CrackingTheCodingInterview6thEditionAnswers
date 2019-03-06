package Chapter_1;

/**

    PROMPT: Implement an algorithm to determine if a string has all unique characters.
    ADDITIONAL: What if you cant use additional data structures?

**/

import java.util.Scanner;

public class Q1_1 {

    public static boolean checkString(String string) {

        boolean isUnique =  true;

        for (int i = 0; i < string.length(); i++) {

            for (int j = 0; j < string.length(); j++) {

                if (i == j) {

                    continue;
                }

                else {

                    if (String.valueOf(string.charAt(i)).equals(String.valueOf(string.charAt(j)))) {

                        isUnique = false;

                    }
                }

            }
        }
        return isUnique;
    }

    public static void main(String q1_1 []) {

        //create scanner
        Scanner s = new Scanner(System.in);

        //prompt user for string
        System.out.println("Enter a string");
            String userString = s.nextLine();

        //check string and print bool result

        if (checkString(userString)) {

            System.out.println("String is unique");
        }

        else {

            System.out.println("String is NOT unique");
        }
        //close scanner
        s.close();

    }
}
