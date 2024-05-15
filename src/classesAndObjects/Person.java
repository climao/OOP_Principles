/**
 * Declaration of a Java class.
 *
 * @author Carlos Limão.
 * @version April 12 2024
 */
package classesAndObjects;

/**
 * A class is a template for building objects (variables).
 * It defines both state (data) and behaviour (code).
 *
 * By convention:
 *      - Class names should be nouns.
 *      - The first letter each word in the class name should be capitalized.
 */
public class Person {
    // State of an object (instance) of this class.
    int age;
    String name;

    // The following methods are the behavior of an object of this class.

    public void setPerson(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void sayName() {
        System.out.println("Hi! My name is " + name);
    }
}
