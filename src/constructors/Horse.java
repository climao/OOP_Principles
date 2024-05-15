/**
 * A derived class to ilustrate class constructors.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package constructors;

public class Horse extends Animal {
    /**
     * This constructor uses the parent class constructor (super).
     */
    Horse() {
        super("horse");
    }

    // Override place() method.
    void place() {
        System.out.println("Horses live in stable.");
    }
}
