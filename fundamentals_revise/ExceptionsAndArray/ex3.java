//Library system
package ExceptionsAndArray;

import java.util.Scanner;
class BookNotAvailableException extends Exception{
  public BookNotAvailableException(String message){
    super(message);
  }
}
public class ex3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    String bookTitle="Java Programming";
    int availableCopies=2;

    String[] similarBooks={
      "Advance Java",
      "Core Java Part 1"
    };

    System.out.print("Enter book name to borrow: ");
    String userRequest = sc.nextLine();

    try{
      borrowBook(userRequest,bookTitle,availableCopies,similarBooks); 
    }catch(BookNotAvailableException e){
      System.out.println(e.getMessage());
      System.out.println("Similar books you may like:");
      for (String book : similarBooks) {
          System.out.println("- " + book);
      }
    }
    sc.close();  
  }

  public static void borrowBook(String requested, String actualTitle, int copies,
   String[] similarBooks) throws BookNotAvailableException{
    if(requested.equalsIgnoreCase(actualTitle)){
      if(copies<=0){
        throw new BookNotAvailableException("Sorry! \"" + actualTitle + "\" is not available right now.");
      }else {
        System.out.println("You have successfully borrowed \"" + actualTitle + "\"");
      }
    } else{
          System.out.println("Book not found in our catalog.");
      }
    }
  }
