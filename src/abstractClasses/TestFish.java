/**
 * A class to test the Fish class.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package abstractClasses;

public class TestFish {

    public static void main(String[] args) {
        //Animal aAnimal = new Animal();    // Error: Animal is abstract; cannot be instantiated.

        // The Animal class can be used to declare a reference for an object of any Animal subclass!
        Animal aFish = new Fish();

        aFish.label();  // The label() method is inherited from the Animal class
        aFish.move();   // The move() method is defined in the Fish class.
        aFish.eat();    // The eat() method is defined in the Fish class.

        // The Fish class can be used to declare a reference for an object of type Fish!
        Fish anotherFish = new Fish();
        anotherFish.label();
        anotherFish.move();
        anotherFish.eat();
    }
}
