/**
 * A class representing a Smartphone.
 *
 * Contrary to the inherintance mechanism that does not support multiple inheritance,
 * a class cam implement multiple interfaces.
 */
package interfaces;

public class Smartphone implements ElectronicDevice, InternetDevice {
    @Override
    public void turnOn() {
        System.out.println("Smartphone turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone turned off");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Smartphone connected to the internet");
    }

    // Additional functionalities specific to smartphones
    public void makeCall(String phoneNumber) {
        System.out.println("Making a call to " + phoneNumber);
    }
}
