//inheritance
class Vehicle {
  void startEngine(){
    System.out.println("Engine is running");
  }
}

class Bike extends Vehicle{
  @Override
  void startEngine(){
    System.out.println("Bike engine is running");
  }
}
