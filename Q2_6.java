package Chapter_2;

/**

    Implement a function to check if a linked list is a palindrome.

 */


import java.util.*;

public class Q2_6 {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        LinkedList<String> palindrome = new LinkedList();
        System.out.println("Enter a word");
        String word = s.nextLine();

        //add to linked list
        for (int i = 0; i < word.length(); i++) {

            palindrome.add(word.valueOf(word.charAt(i)));
        }

        //check for palindrome
        String backwards = "";

        for (int i = palindrome.size() - 1; i >= 0; i--) {

            backwards += palindrome.get(i);

        }

        if (word.equals(backwards)) {

            System.out.println("Palindrome!");

        }

        else {

            System.out.println("Not a Palindrome!");
        }

        s.close();
    }
}
