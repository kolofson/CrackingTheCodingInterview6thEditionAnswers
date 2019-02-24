package Chapter_1;

import java.util.Scanner;

public class Q1_4 {

    public static void main(String[] q1_4) {

        Scanner s = new Scanner (System.in);
        System.out.println("Enter a word");
        String userWord = s.nextLine();

        StringBuilder backwards = new StringBuilder(userWord).reverse();

        if (userWord.equals(backwards.toString())) {
                System.out.println("Its a palindrome!");
        }

        else {
                System.out.println("Its not a palindrome!");
        }

        System.out.println("Original Word: " + userWord + "\nBackwards Version: " + backwards);
        s.close();
    }

}

