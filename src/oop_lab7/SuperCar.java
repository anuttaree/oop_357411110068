package oop_lab7;

//car brand
//car cllor
//car engine size
//max speed
//country of origin

public class SuperCar {

    public String getSuperCarInfo() {
        return "SuperCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", enginesize='" + enginesize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    private String brand;
    private String color;
    private String enginesize;
    private String maxspeed;
    private String origin;
    //Constructor
    //Default constructor
    public SuperCar(){}
    public SuperCar(String b,String c,String e,String m,String o){
        //assign data to class properties
        this.brand = b;
        this.color = c;
        this.enginesize = e;
        this.maxspeed = m;
        this.origin = o;
    }
    //getter and setter method

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnginesize() {
        return enginesize;
    }

    public void setEnginesize(String enginesize) {
        this.enginesize = enginesize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}//class
