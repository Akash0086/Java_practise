package oops.oop1;
//Class and object example
public class basic {
  public class Car {
    String make;
    String model;
    int year;

    public static void main(String[] args) {
        // Create first Car object
        Car car1 = new Car();
        car1.make = "Honda";
        car1.model = "FZ";
        car1.year = 2010;

        // Create second Car object
        Car car2 = new Car();
        car2.make = "KTM";
        car2.model = "RC";
        car2.year = 2024;

        // Print the attributes
        System.out.println("Car 1: " + car1.year + " " + car1.make + " " + car1.model);
        System.out.println("Car 2: " + car2.year + " " + car2.make + " " + car2.model);
    }
}

  
}
