package Chapter_1;

/**

    PROMPT: Implement an algorithm to determine if a string has all unique characters.
    ADDITIONAL: What if you cant use additional data structures?

**/

import java.util.Scanner;

public class Q1_1 {

    public static boolean checkString(String string) {

        boolean isUnique = false;
        int track = 0;

        for (int i = 0; i < string.length(); i++) {

            char currentIndex = string.charAt(i);
            char nextIndex = 0;

            //check if reached too far
            try {

                track = i++;
                nextIndex = string.charAt(track);

            }

            catch (Exception e) {

                break;
            }

            if (currentIndex == nextIndex) {

                isUnique = false;
                break;
            }

            else {

                isUnique = true;
                //check for previous letters to current letter
                if (i != 0) {

                    for (int j = 0; j <= i; j++) {

                        if (j == i) {

                            break;
                        }

                        if (currentIndex == string.charAt(j)) {

                            isUnique = false;
                            break;
                        }

                    }

                    //check for previous letters with previous letters from currentIndex
                    for (int k = 0; k < i; k++) {

                        if (nextIndex == string.charAt(k)) {

                            isUnique = false;
                            break;
                        }
                    }
                }
                continue;
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
