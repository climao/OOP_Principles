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

        // The Animal class can be used to declare a reference for an object of any Animal subclass!
        Animal aBird = new Bird();

        aBird.label();   // The label() method is inherited from the Animal class
        aBird.move();    // The move() method is defined in the Bird class.
        aBird.eat();     // The eat() method is defined in the Bird class.

        // The Bird class can be used to declare a reference for an object of type Bird!
        Bird anotherBird = new Bird();
        anotherBird.label();
        anotherBird.move();
        anotherBird.eat();
    }
}
