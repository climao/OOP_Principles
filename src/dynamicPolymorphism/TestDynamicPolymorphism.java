/**
 * A test class to ilustrate dynamic polymorphism.
 *
 * A call to an overriden method is resolved at runtime.
 * Required when a subclass object is assigned to a superclass reference.
 * The object type (not the reference type) determines which version of the method is called.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package dynamicPolymorphism;

public class TestDynamicPolymorphism {
    public static void main(String[] args) {

        Animal oneAnimal = new Animal();  // Animal reference stores an Animal object (no polymorphism involved).
        oneAnimal.eat();                  // Object (Animal) method is called.

        Bird oneBird = new Bird();        // Bird reference stores a Bird object.
        oneBird.eat();                    // Object (Bird) method is called.

        Animal otherAnimal = new Bird();  // Animal reference stores a Bird object.
        otherAnimal.eat();                // Object (Bird) method is called.

        //Bird otherBird = new Animal();  // Error! A reference can only store derived class objects.
    }
}
