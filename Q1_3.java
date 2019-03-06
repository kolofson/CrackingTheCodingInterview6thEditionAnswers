package Chapter_1;

/**

    PROMPT: Write a method to replace all spaces in a string with '%20'.

 */

import java.util.Scanner;

public class Q1_3 {

    public static String replaceString(String string) {

        String newString = string;

        for (int i = 0; i < newString.length(); i++) {

            if (Character.isWhitespace(newString.charAt(i)) == true) {

                newString = newString.replaceFirst(newString.valueOf(newString.charAt(i)), "%20");

            }

            else {

                continue;
            }
        }
        return newString;
    }

    public static void main(String q1_3 []) {

        //create scanner
        Scanner s = new Scanner(System.in);

        //ask user for string
        System.out.println("Enter a string to be replaced");
            String str = s.nextLine();
        System.out.println(replaceString(str));
        //close scanner
        s.close();


    }
}
