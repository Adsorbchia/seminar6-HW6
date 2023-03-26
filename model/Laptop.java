package org.example.seminar6.model;


public class Laptop implements FilterLaptop{

    private String color;
    private double screenDiagonal;
    private int screenRefreshRate;
    private String screenResolution;
    private String processor;
    private int ram;
    private String driveType;
    private String manufacturer;
    private double price;
    public Laptop(String color,double screenDiagonal,int screenRefreshRate,String screenResolution,String processor,
                  int ram,String driveType,String manufacturer,double price ){
        this.color=color;
        this.screenDiagonal=screenDiagonal;
        this.screenRefreshRate=screenRefreshRate;
        this.screenResolution=screenResolution;
        this.processor=processor;
        this.ram=ram;
        this.driveType=driveType;
        this.manufacturer=manufacturer;
        this.price=price;
    }
    public String getColor(){
        return color;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public int getScreenRefreshRate() {
        return screenRefreshRate;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public String getDriveType() {
        return driveType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public void setScreenRefreshRate(int screenRefreshRate) {
        this.screenRefreshRate = screenRefreshRate;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
