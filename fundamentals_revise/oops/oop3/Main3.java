package oops.oop3;

public class Main3 {
  public static void main(String[] args) {
      Animal[] animal={new Dog(),new Cat()};

      for(Animal a:animal){
        a.makeSound();
      }
  }
}
