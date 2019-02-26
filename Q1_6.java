package Chapter_1;

/**

    Implement a method to perform basic string compression using the counts of repeated characters.

    EXAMPLE:
        I: aabcccccaaa
        O: a2b1c5a3
    **Unless compressed string is longer return original string

 */

import java.util.Scanner;

public class Q1_6 {

    public static String compressString(String string) {

        String compressedString = "";
        int count = 1;
        int j = 0, place = 0;
        char index = 0, index2 = 0;

        for (int i = 0; i < string.length(); i++) {

            compressedString = compressedString.trim();

            try {

                index = string.charAt(i);
                j = i + 1;
                index2 = string.charAt(j);
            }

            catch (Exception e) {

                int lastIndex = place + 1;
                compressedString = compressedString + string.charAt(lastIndex) + count;
                break;
            }

            //letter matches
            if (index == index2) {

                count++;
                String nextLine = compressedString + index + count;

                //prevent from adding same thing more than once

                try {

                    int length = compressedString.length() + 1;

                    System.out.println(compressedString.substring(length - 2, length));

                    if (compressedString.substring(length - 2, length).equals(nextLine)) {

                        compressedString = nextLine;

                     }
                }

                catch (Exception e) {

                    continue;
                }
            }

            //letter doesn't match
            else {

                if (i == 0) {

                    place = 0;
                }

                else {

                    place = i;
                }

                compressedString = compressedString + string.charAt(place) + count;

                count = 1;
                continue;
            }
        }

        if (string.length() < compressedString.length()) {

            return string;
        }

        else {

            return compressedString;
        }
    }

    public static void main(String args[]) {

        //create a scanner
        Scanner s = new Scanner(System.in);

        //get data
        System.out.println("Enter a string to compress");
            String s1 = s.nextLine();

        //run algorithm
        System.out.println(compressString(s1));

        //close scanner
        s.close();

    }
}
