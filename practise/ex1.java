package practise;

public class ex1 {
  public static void main(String[] args){
  Abc obj=new Abc();
  obj.a=10;
  obj.myclass();
  
}
}
class Abc{
  int a;
  public void myclass(){
  System.out.println("the method is created");
  System.out.println(a);
}
}
