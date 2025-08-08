package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class col1 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String vowels="aeiouAeiou";

    ArrayList<String> names=new ArrayList<>();
    

    while(true) {
      System.out.print("Enter the Student Name or type 'stop' to finish:");
        String StudentN=sc.nextLine();
        if(StudentN.equalsIgnoreCase("stop")){
          break;
        }
        names.add(StudentN);
    }
    //remove names start with vowel words

    Iterator<String> iterator=names.iterator();
    while(iterator.hasNext()){
      String name=iterator.next();
      if(vowels.indexOf(name.charAt(0))!=-1){
        iterator.remove();
      }
    }
    Collections.reverse(names);
    System.out.print(names);

    sc.close();
    }

    
  }
  

