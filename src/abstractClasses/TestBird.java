/**
 * A class to test the Bird class.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package abstractClasses;

public class TestBird {

    public static void main(String[] args) {
        //Animal aAnimal = new Animal();    // Error: Animal is abstract; cannot be instantiated.

        // Create a Bird object and store its reference.
        Bird aBird = new Bird();

        aBird.label();   // The label() method is inherited from the Animal class
        aBird.move();    // The move() method is defined in the Bird class.
        aBird.eat();     // The eat() method is defined in the Bird class.
    }
}
