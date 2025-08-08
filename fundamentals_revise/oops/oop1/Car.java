package oops.oop1;

public class Car {
  String make;
  String model;
  int year;
  public Car(String make,String model,int year){
    this.make=make;
    this.model=model;
    this.year=year;
  }
  
  @Override
  public String toString(){
    return make+" "+model+" "+year;
  }

  public static void main(String[] args){
    Car car1=new Car("Honda","FZ",2010);
    Car car2=new Car("KTM","RC",2024);

    System.out.println(car1);
    System.out.println(car2);
  }
  
}
