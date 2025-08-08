package oops_2;

class counter{
  static int count=0;

  static void increament(){
    count++;
    System.out.println(count);
  }
}
public class Oop_static {
  public static void main(String[] args) {
      counter.increament();

      counter c1=new counter();
      c1.increament();

      counter c2=new counter();
      c2.increament();

      System.out.println("Final count : "+counter.count);

  }
}
