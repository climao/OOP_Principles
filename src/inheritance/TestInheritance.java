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

        System.out.println("Name: " + myEagle.name);
        System.out.println("Reproduction: " + myEagle.reproduction);
        System.out.println("Outer covering: " + myEagle.outerCovering);
        System.out.println("Lifespan: " + myEagle.lifespan);
        myEagle.flyUp();
        myEagle.flyDown();
    }
}
