package se.lexicon.java;

public class Monitor {
    private String model;
    private String manufacturer;
    private int Size;
    private Resolution nativeResolution; //you just need to create a class for the resolution. see it is in caps
    //this resolution is not part of what makes a computer but a features of a monitor which can be on its own

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        Size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return Size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
