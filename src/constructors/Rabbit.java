/**
 * A derived class to ilustrate class constructors.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package constructors;

public class Rabbit extends Animal {
    /**
     * This constructor uses the parent class constructor (super).
     */
    Rabbit() {
        super("rabbit");
    }

    // Override place() method.
    void place(){
        System.out.println("Rabbits live in burrow.");
    }
}
