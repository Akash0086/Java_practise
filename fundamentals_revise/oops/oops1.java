package oops_2;

class Book{
  String title;
  String author;
  int price;

  int applyDiscount(double percentage){
    double discountAmount=price/percentage;
    int discountPrice=(int) price-(int)discountAmount;
    return discountPrice;
  }
}
public class oops1 {
  public static void main(String[] args) {
     Book b1=new Book();
     b1.title="Psychology of money";
     b1.author="Glad saad";
     b1.price=2000;
     System.out.println("Book 1:");
     System.out.println(b1.title);
     System.out.println(b1.author);
     System.out.println("Discounted price: "+b1.applyDiscount(20)); 

     Book b2=new Book();
     b2.title="Psychology of money";
     b2.author="Glad saad";
     b2.price=1000;
     System.out.println("Book 2:");
     System.out.println(b2.title);
     System.out.println(b2.author);
     System.out.println("Discounted price: "+b2.applyDiscount(20));

  }
  
}
