package se.lexicon.java;

public class App
{
    public static void main( String[] args ) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Resolution nativeResolution = new Resolution(2540, 1440);
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, nativeResolution);
        //the nativeResolution can be passed directly if it will not be used again or use like the dimensions
        //Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        //this line below builds the PC and to access the methods
        PC thePC = new PC(theCase, monitor, theMotherboard);
        thePC.powerUp();







        //this get methods have been replaced with private so it will not work

//        thePC.getMonitor().drawPixelAt(1500, 1200,"red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        //if you do not want the getMethods to be implemented here, then you can implement private in the...
        //...the classes you want to prevent direct access to



    }
}
