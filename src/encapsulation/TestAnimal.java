/**
 * A tester class for the Animal class.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package encapsulation;

public class TestAnimal {
    public static void main(String[] args) {

        Animal aAnimal = new Animal();

        // Change Animal properties.
        aAnimal.setName("Eagle");
        aAnimal.setAverageWeight(1.5);
        aAnimal.setNumberOfLegs(2);

        // Show Animal properties.
        System.out.println("Name: " + aAnimal.getName());
        System.out.println("Average weight: " + aAnimal.getAverageWeight() + "kg");
        System.out.println("Number of legs: " + aAnimal.getNumberOfLegs());
    }
}
