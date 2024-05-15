/**
 * A test class to ilustrate class constructors.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package constructors;

public class TestConstructors {
    public static void main(String[] args) {

        // The default Animal constructor sets the name as "animal"
        Animal aAnimal = new Animal();
        aAnimal.displayName();
        aAnimal.place();

        // The default Dog constructor calls the parameterized Animal constructor to set the name as "dog"
        Dog aDog = new Dog();
        aDog.displayName();
        aDog.place();             // The most specialized place() method is called (the one defined in Dog)!

        // The default Horse constructor calls the parameterized Animal constructor to set the name as "horse"
        Horse aHorse = new Horse();
        aHorse.displayName();
        aHorse.place();           // The most specialized place() method is called (the one defined in Horse)!

        // The default Rabbit constructor calls the parameterized Animal constructor to set the name as "rabbit"
        Rabbit aRabbit = new Rabbit();
        aRabbit.displayName();
        aRabbit.place();          // The most specialized place() method is called (the one defined in Rabbit)!
    }
}
