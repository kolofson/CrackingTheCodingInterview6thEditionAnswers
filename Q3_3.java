package Chapter_3.Question3;

/**

    Imagine a literal stack of plates, if it gets too high it might topple. Implement a data structure SetOfStacks
    that mimics this. SetOfStacks should be composed of several stacks and should create a new one when it gets too
    high.

    Implement a function popAt() pop a specific sub-stack

 */

public class Q3_3 {

    public static void main(String []a) {

        Plates plates = new Plates();

        plates.push(2);
        plates.push(-45);
        plates.push(201);
        plates.push(52);
        plates.push(-2);

        //max out first stack
        plates.push(55);
        plates.push(2);
        plates.push(-45);
        plates.push(201);
        plates.push(52);

        //max out last stack
        plates.push(-2);
        plates.push(2);
        plates.push(-45);
        plates.push(201);
        plates.push(52);
        plates.push(-2);

        //test popAt()
        plates.popAt(1);
    }
}
