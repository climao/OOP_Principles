package classVariables;


public class TestBicycle {
    public static void main(String [] args) {
        Bicycle b1 = new Bicycle(10, 20, 2);
        System.out.println("Bicycle " + b1.getID() + " has speed " + b1.getSpeed() + " Km/h");

        System.out.println("Total bikes (after creating object 1): " + Bicycle.getNumberOfBicycles());

        Bicycle b2 = new Bicycle(20, 10, 1);
        System.out.println("Bicycle " + b2.getID() + " has speed " + b2.getSpeed() + " Km/h");

        // A static (class) method can be called using class name or an object.
        System.out.println("Total bikes (via class): " + Bicycle.getNumberOfBicycles());
        System.out.println("Total bikes (via object 1): " + b1.getNumberOfBicycles());
        System.out.println("Total bikes (via object 2): " + b2.getNumberOfBicycles());
    }
}
