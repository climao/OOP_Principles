/**
 * A base class to ilustrate static polymorphism.
 *
 * Also called Compile-time polymorphism enables multiple methods within a class to share the same name
 * if they differ in their parameter lists.
 * The decision on which method to invoke is made during compile time rather than at runtime.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package staticPolymorphism;

public class Bird {
    public void fly() {
        System.out.println("The bird is flying.");
    }
    public void fly(int height) {
        System.out.println("The bird is flying " + height + " metres high.");
    }
    public void fly(String name, int height) {
        System.out.println("The " + name + " is flying " + height + " metres high.");
    }
}
