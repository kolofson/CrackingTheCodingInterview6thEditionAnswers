package Chapter_3.Question2;

/**

    How would you design a stack which, in addition to push and pop, has a function min
    which returns the minimum element.

 */

public class Q3_2 {


    public static void main (String args[]) {

        sideClass s = new sideClass();

        s.push(62);
        s.push(105);
        s.push(-27);
        s.push(12);
        s.push(33);
        s.push(-2);
        s.push(8);
        s.push(0);
        s.push(203);

        //program

        s.min();
    }
}
