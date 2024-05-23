package classVariables;

public class Bicycle {

    private int cadence;
    private int gear;
    private int speed;

    private int id;

    // A static variable exists in the class and is shared by all class objects.
    private static int numberOfBicycles = 0;

    public Bicycle(int startCadence,
                   int startSpeed,
                   int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // This class variable is used to count the created number of objects of this class.
        id = ++numberOfBicycles;
    }

    public int getID() {
        return id;
    }

    // This is a class method, shared by all objects.
    public static int getNumberOfBicycles() {
        // Class methods cannot access instance variables or instance methods
        //this.applyBrake();    // Compilation error!
        //this.speed--;         // Compilation error!
        return numberOfBicycles;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getGear(){
        return gear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}