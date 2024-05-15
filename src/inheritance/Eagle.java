/**
 * A derived class to show inheritance in Java.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package inheritance;

public class Eagle extends Bird {
    public String name = "eagle";
    public int lifespan = 15;

    public void flyDown() {
        System.out.println("Flying down like an eagle...");
    }
}
