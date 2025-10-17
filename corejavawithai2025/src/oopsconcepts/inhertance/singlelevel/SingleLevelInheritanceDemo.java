package oopsconcepts.inhertance.singlelevel;

public class SingleLevelInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the subclass
        SmartPhone mySmartPhone = new SmartPhone();
        // Inherited methods from BasicPhone
        mySmartPhone.makeCall();     // Inherited
        mySmartPhone.sendText();     // Inherited
        // Method unique to Smartphone
        mySmartPhone.takePhoto();    // Defined only in Smartphone
    }
}
