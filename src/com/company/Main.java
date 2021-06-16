package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("22BB", "Dell", "240", dimensions);

        // De variable van com.company.Resolution kan je ook gelijk een waarde geven, dit is een snelle instantie van die class.
        Monitor theMonitor = new Monitor("The Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("w/e", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.getMonitor().drawPixelAt(1500, 1200, "Green");
//        thePC.getMotherboard().loadProgram("Windows 10PX");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();














    }
}
