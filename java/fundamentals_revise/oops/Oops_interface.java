package oops_2;

interface flyable{
  void fly();
}

class Bird implements flyable{
  @Override
  public void fly(){
    System.out.println("A bird can fly");
  }
}

class Airplane implements flyable{
  @Override
  public void fly(){
    System.out.println("A plane can fly");
  }
}
public class Oops_interface{
  public static void main(String[] args) {
    Bird b=new Bird();
    b.fly();  
    
    flyable a=new Airplane();
    a.fly();
  }
  

}