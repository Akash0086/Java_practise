package oops_2;

class Student{
  String name;
  int rollNumber;
  int mark=0;
  
  public Student(String name,int rollNumber,int mark){
    this.name=name;
    this.rollNumber=rollNumber;
    this.mark=mark;
  }
  public Student(String name,int rollNumber){
    this.name=name;
    this.rollNumber=rollNumber;
    this.mark=0;
  }
  
}
public class oops2 {
  public static void main(String[] args) {
      Student s1=new Student("AKash", 16,45);

      Student s2=new Student("Moni",26);

      System.out.println("Name:"+s1.name+" RollNumber:"+s1.rollNumber+" Mark:"+s1.mark);
      System.out.println("Name:"+s2.name+" RollNumber:"+s2.rollNumber);

    } 
}
