package oop_lab7;

import java.util.Scanner;

public class mySuperCar {



    public static void main (String [] args) {
       // create Objects as SuperCar
        SuperCar supercar1 = new SuperCar();

        supercar1 = inputData(supercar1);

        System.out.println(supercar1.getSuperCarInfo());





    }//main
    private static SuperCar inputData(SuperCar s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your supercar info: ");
        System.out.print("Brand: ");
        s.setBrand(scanner.nextLine());
        System.out.print("color: ");
        s.setColor(scanner.nextLine());
        System.out.print("enginesize: ");
        s.setEnginesize(scanner.nextLine());
        System.out.print("maxspeed: ");
        s.setMaxspeed (scanner.nextLine());
        System.out.print("origin: ");
        s.setOrigin(scanner.nextLine());


        return s;


    }
}//class

