package oops.oop4;

abstract class shape{
  abstract void getArea();
}

class Circle extends shape{
  @Override
  void getArea(){
    System.out.println("Area of circle");
  }
  void shapeType(){
    System.out.println("it is circle shape");
  }
}
class Rectangle extends shape{
  @Override
  void getArea(){
    System.out.println("Area of rectangle");
  }
  void shapeType(){
    System.out.println("it is rectangle shape");
  }
}

public class Main4 {
  public static void main(String[] args) {
    shape s=new Circle();//Reference is Shape type(access only a methoda that shape class contain in circle)
    s.getArea();  
    
    Circle c=new Circle();//Reference of circle(access all the method contain in circle)
    c.shapeType();
  }
  
}
