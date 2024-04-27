package abstractClasses;

/**
 * Since it is the last class in the hierarchy chain, this class must implement the Animal's abstract methods.
 *
 * The @Override annotation informs the compiler that the method is meant to override the one
 * declared in the superclass. It is not mandatory, but helps to prevent errors.
 */

public class Bird extends Animal {
    @Override
    void move() {
        System.out.println("I move by flying.");
    }

    @Override
    void eat() {
        System.out.println("I eat grains and insects.");
    }
}
