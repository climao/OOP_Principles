/**
 * A base class to ilustrate dynamic polymorphism.
 *
 *  Also known as runtime polymorphism, because the decision on which method to invoke is made during runtime.
 *  This is achieved by using method overriding. When a method is called through a reference variable of a superclass,
 *  the determination of the method to be called is based on the object being referred.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package dynamicPolymorphism;

public class Animal {
    /**
     * Defines a generic place() method.
     */
    public void eat() {
        System.out.println("I am an Animal. What do I eat?");
    }
}
