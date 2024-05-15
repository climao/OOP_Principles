/**
 * A test class to ilustrate static polymorphism.
 *
 * The decision on what method to call is made at compile time, based on the **number and types** of parameters.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package staticPolymorphism;

public class TestStaticPolymorphism {

    public static void main(String[] args) {
        Bird myBird = new Bird();

        myBird.fly();                           // call method without parameters.
        myBird.fly(100);                  // call method with an "int" parameter.
        myBird.fly("pigeon", 30);   // call method with first parameter "String" and seconf parameter "int".
    }
}
