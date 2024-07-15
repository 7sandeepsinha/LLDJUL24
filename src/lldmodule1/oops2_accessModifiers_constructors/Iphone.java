package lldmodule1.oops2_accessModifiers_constructors;

public class Iphone {
    public int number; // increases by 1 
    public int processorVersion; // increases by 1  
    public int price; // increases by 5000
    // all below attributes remain same
    public int batterySize;
    public int screenSize;
    public int numberOfCameras;
    public int megapixel;
    public int memory;
    public String displayType;
    public String dimensions;
    
    public Iphone(){ // default or no-args constructor
    }

    // parameterised or args constructor
    public Iphone(int iNumber, int iProcessorVersion, int iPrice, int iBatterySize,
                  int iScreenSize, int iNumberOfCameras, int iMegapixel, int iMemory,
                  String iDisplayType, String iDimensions) {
        number = iNumber;
        processorVersion = iProcessorVersion;
        price = iPrice;
        batterySize = iBatterySize;
        screenSize = iScreenSize;
        numberOfCameras = iNumberOfCameras;
        megapixel = iMegapixel;
        memory = iMemory;
        displayType = iDisplayType;
        dimensions = iDimensions;
    }

    //copy constructor
    public Iphone(Iphone iphone){
        number = iphone.number + 1;
        processorVersion = iphone.processorVersion + 1;
        price = iphone.price + 5000;
        batterySize = iphone.batterySize;
        screenSize = iphone.screenSize;
        numberOfCameras = iphone.numberOfCameras;
        megapixel = iphone.megapixel;
        memory = iphone.memory;
        displayType = iphone.displayType;
        dimensions = iphone.dimensions;
    }


    public String toString() {
        return "Iphone{" +
                "number=" + number +
                ", processorVersion=" + processorVersion +
                ", price=" + price +
                ", batterySize=" + batterySize +
                ", screenSize=" + screenSize +
                ", numberOfCameras=" + numberOfCameras +
                ", megapixel=" + megapixel +
                ", memory=" + memory +
                ", displayType='" + displayType + '\'' +
                ", dimensions='" + dimensions + '\'' +
                '}';
    }
}
// break till 10:45 PM