/**
 * A tester class to show inheritance in Java.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Eagle myEagle = new Eagle();

        // The Eagle object has properties and behaviour defined in the Eagle class...
        System.out.println("Name: " + myEagle.name);
        System.out.println("Lifespan: " + myEagle.lifespan);

        // ... but has also inherited the Bird's properties and behaviour.
        System.out.println("Reproduction: " + myEagle.reproduction);
        System.out.println("Outer covering: " + myEagle.outerCovering);

        myEagle.flyUp();

        // The inherited behaviour can be overriden (redefined).
        myEagle.flyDown();
    }
}
