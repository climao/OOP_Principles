/**
 * A declaration of a Java class.
 *
 * @author Carlos Limão.
 * @version April 12 2024
 */
package classesAndObjects;

/**
 * A class is a template for building objects (variables).
 * It defines both state (data) and behaviour (code).
 */
public class Person {
    // State of an object (instance) of this class.
    int age;
    String name;

    // Behavior of an object of this class.
    public void set_value() {
        age = 20;
        name = "Jack";
    }
    public void get_value() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
