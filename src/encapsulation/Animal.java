/**
 * A class showing encapsulation.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package encapsulation;

public class Animal {
    /**
     * All instance variables are "private" making them inaccessible to othe classes.
     */
    private String name;
    private double averageWeight;
    private int numberOfLegs;

    // Getter methods - Only way to "get" object state.
    public String getName() {
        return name;
    }
    public double getAverageWeight() {
        return averageWeight;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    // Setter methods - Only way to "set" (change) object state.
    public void setName(String name) {
        this.name = name;
    }
    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
