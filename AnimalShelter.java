package Chapter_3.Question6;

import java.util.*;

public class AnimalShelter {

    Queue<String> dogs ;
    Queue<String> cats;

    AnimalShelter() {
        dogs = new LinkedList();
        cats = new LinkedList();
    }

    public void enqueue(String breed, String name) {
        if (breed.equals("dog")) {
            dogs.add(name);
        }

        else {
            cats.add(name);
        }
    }

    public String dequeueDog() {

        return dogs.remove();
    }

    public String dequeueCat() {

        return cats.remove();
    }

    public String dequeueAny() {

        int who = (int) (Math.random() * 2) + 1;
        String child = "";
        if (who == 1) {
            child = cats.remove();
        }

        else {
            child = dogs.remove();
        }

        return child;
    }
}
