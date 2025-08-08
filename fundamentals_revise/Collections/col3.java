package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class col3 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    HashMap<String,Integer> items=new HashMap<>();
    items.put("DEll G15",75000);

    System.out.println("Enter the number of entries :");
    int n=sc.nextInt();
    sc.nextLine();//consume leftover newline

    System.out.println("Enter Product and price separated by space (one per line):");

    for(int i=0;i<n;i++){
      String line=sc.nextLine();
      String[] part=line.split("\\s+");

      if(part.length==2){
        String product=part[0];
        int prize=Integer.parseInt(part[1]);

        if(items.containsKey(product)) {
          System.out.println("Product already exists. Updating the price.");
        }
        items.put(product,prize);
      } else{
          System.out.println("Invalid input format. Skipping line.");
        }

    }
    System.out.println("Final items: " + items);

    System.out.println("Enter the product name to remove :");
    String productRemove=sc.nextLine();
    items.remove(productRemove);
    
    System.out.println("Final items after removed: " + items);

    List<Map.Entry<String,Integer>> itemList=new ArrayList<>(items.entrySet());
    
    itemList.sort(Map.Entry.comparingByValue());

    for(Map.Entry<String,Integer> entry:itemList){
      String product=entry.getKey();
      int price=entry.getValue();
      System.out.println(product+"->"+price);


    }
  }
  
}
