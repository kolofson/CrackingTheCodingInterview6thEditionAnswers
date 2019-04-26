package Chapter_3.Question6;

import javax.swing.*;

public class DriverClass {

    public static void main(String [] args) {

        AnimalShelter animals = new AnimalShelter();
        //add animals
        //dogs
        animals.enqueue("dog", "peanut");
        animals.enqueue("dog", "dexter");
        animals.enqueue("dog", "brandi");
        animals.enqueue("dog", "wilma");
        //cats
        animals.enqueue("cat", "sammy");
        animals.enqueue("cat", "blake");
        animals.enqueue("cat", "max");
        animals.enqueue("cat", "felicia");

        while (!animals.dogs.isEmpty() || !animals.cats.isEmpty()) {
            //ask for animal
            String adopt = JOptionPane.showInputDialog("Would you like to adopt a :\nDOG\nCAT\nEITHER");

            //convert answer
            adopt = adopt.toLowerCase().trim();

            //program
            if (adopt.equals("cat")) {
                JOptionPane.showMessageDialog(null, "Congratulations you adopted : " + animals.dequeueCat());

            } else if (adopt.equals("dog")) {

                JOptionPane.showMessageDialog(null, "Congratulations you adopted : " + animals.dequeueDog());
            } else {

                JOptionPane.showMessageDialog(null, "Congratulations you adopted : " + animals.dequeueAny());
            }
        }
    }
}
