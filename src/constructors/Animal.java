/**
 * A base class to ilustrate class constructors.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
 package constructors;

class Animal {
    private String name;    // Private instance variable

    /**
     * The default construcor doesn't have any parameters.
     * If not implemented, the compiler will provide one.
     *
     * A constructor doesn't have a return type.
     */
    Animal() {
        this.name = "animal";
    }

    /**
     * There can exist multiple constructors.
     * They must differ in the number and type of parameters.
     */
    Animal(String name) {
        this.name = name;
    }

    void place() {
        System.out.println("Animals live on earth.");
    }

    void displayName() {
        System.out.println(name);
    }
}
