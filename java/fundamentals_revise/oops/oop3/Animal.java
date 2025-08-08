package oops.oop3;

class Animal {
  void makeSound(){
    System.out.println("It is Animal Sound ");
  }
}

class Dog extends Animal{
  @Override
  void makeSound(){
    System.out.println("Dog barking");
  }
}
class Cat extends Animal{
  @Override
  void makeSound(){
    System.out.println("meooow");
  }
}

