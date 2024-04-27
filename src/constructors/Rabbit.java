/**
 * A derived class to ilustrate class constructors.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package constructors;

public class Rabbit extends Animal {
    Rabbit() {
        super("rabbit");
    }
    void place(){
        System.out.println("Rabbits live in burrow.");
    }
}
