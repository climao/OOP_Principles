/**
 * Test the Smartphone class.
 */
package interfaces;

public class TestSmartphone {
    public static void main(String[] args) {
        // Create a smartphone object
        Smartphone smartphone = new Smartphone();

        smartphone.turnOn();
        smartphone.connectToInternet();
        smartphone.makeCall("123456789");
        smartphone.turnOff();
    }
}
