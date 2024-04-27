/**
 * A test class to ilustrate static polymorphism.
 *
 * The decision on what method to call is made at compile time, based on the number and types of parameters.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package staticPolymorphism;

public class TestStaticPolymorphism {
    public static void main(String[] args) {

        Bird myBird = new Bird();

        myBird.fly();
        myBird.fly(100);
        myBird.fly("pigeon", 30);
    }
}
