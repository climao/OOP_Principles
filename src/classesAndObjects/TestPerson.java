/**
 * A class to test the Person class.
 * All java code must reside inside a class, as a method.
 *
 * @author Carlos Limão.
 * @version April 12 2024
 */
package classesAndObjects;

public class TestPerson {
    /**
     * This is the entry point in a Java program.
     */
    public static void main(String [] args) {
        // Create a new Person object.
        // The new operator creates a new object in a special memory area (the heap).
        // p holds is a reference to the object (not the object itself).
        Person p = new Person();

        // Change the new object state using the available (exposed) behavior.
        // We use the "dot" operator to access methods and properties of the object.
        p.set_value();

        p.get_value();
    }
}
