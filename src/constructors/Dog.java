/**
 * A derived class to ilustrate class constructors.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package constructors;

public class Dog extends Animal {

    Dog() {
        super("dog");
    }
    void place() {
        System.out.println("Dogs live in kennel.");
    }
}
