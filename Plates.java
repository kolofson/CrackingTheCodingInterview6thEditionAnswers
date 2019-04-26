package Chapter_3.Question3;

import java.util.*;

public class Plates {

    Stack<Integer> plates;
    Stack<Integer> plates2;
    Stack<Integer> plates3;

    Plates() {
        plates = new Stack();
        plates2 = new Stack();
        plates3 = new Stack();
    }


    void topple(int obj) {

        //threshold for plate piles
        if (plates.size() >= 5) {

            if (plates2.size() >= 5) {

                if (plates3.size() >= 5) {

                }

                else {
                    plates3.push(obj);
                }
            }

            else {
                plates2.push(obj);
            }
        }

        else {
            plates.push(obj);
        }

        System.out.println("STACK 1: " + plates + "\nSTACK 2: " + plates2 + "\nSTACK 3: " + plates3);
    }

    void push(int obj) {

        topple(obj);
    }

    void pop() {

        if (plates3.isEmpty()) {

            if (plates2.isEmpty()) {

                plates.pop();
            }

            else {

                plates2.pop();
            }
        }

        else {
            plates3.pop();
        }
    }

    void popAt(int index) {

        if (index == 0) {

            plates.pop();
        }

        else if (index == 1) {

            plates2.pop();
        }

        else if (index == 2) {

            plates3.pop();
        }

        else {

            System.out.println("Not a valid stack");
        }

    }
}
