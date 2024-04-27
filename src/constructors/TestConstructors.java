/**
 * A test class to ilustrate class constructors.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package constructors;

public class TestConstructors {
    public static void main(String[] args) {

        Animal aAnimal = new Animal();
        aAnimal.displayName();
        aAnimal.place();

        Animal aDog = new Dog();
        aDog.displayName();
        aDog.place();

        Animal aHorse = new Horse();
        aHorse.displayName();
        aHorse.place();

        Animal aRabbit = new Rabbit();
        aRabbit.displayName();
        aRabbit.place();
    }
}
