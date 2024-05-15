/**
 * A base class to ilustrate abstract classes.
 *
 * Data abstraction focuses on hiding the class implementation details from its users.
 *
 * The "abstract" keyword can be used with either classes or methods:
 *   - An abstract class is a class that cannot be instantiated (i.e. used to create objects).
 *   - An abstract method (used in abstract classes only) is a method that doesn't have a body and should be
 *     implemented by a subclass.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package abstractClasses;

/**
 * This class cannot be instantiated.
 */
abstract class Animal {
    /**
     * The following declarations mean that any derived class must implement both move() and eat() methods.
     */
    abstract void move();
    abstract void eat();

    // concrete method
    void label() {
        System.out.println("I'm an animal!");
    }
}
