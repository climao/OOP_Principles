/**
 * A child class to ilustrate dynamic polymorphism.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package dynamicPolymorphism;

public class Bird extends Animal {
    /**
     * Overrides the base class method to specialize a Bird's behaviour.
     *
     * Rules:
     *   - Method name must be the same as the parent's class method.
     *   - Number and types of parameters must be the same as in the parent's class method.
     *   - There must be an inheritance relationship between this class
     *     and the class where the overriden method resides.
     */
    public void eat() {
        System.out.println("I am a bird and I eat seeds.");
    }
}
