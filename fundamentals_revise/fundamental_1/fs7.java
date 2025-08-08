package fundamental_1;

public class fs7 {
 
    public static void max(int a,int b){
      int maximum=Math.max(a, b);
      System.out.println(maximum);
    }
    public static void max(double a,double b){
      double maximum=Math.max(a,b);
      System.out.println(maximum);
    }
    public static int max(int[] arr,int size){
      int maximum=arr[0];
      for(int i=1;i<size;i++){
        if(arr[i]>maximum){
          maximum=arr[i];
        }
      }
      return maximum;
    }


  public static void main(String[] args){
     System.out.println("Max of 10 and 25:");
     max(10, 25); 
     System.out.println("Max of 5.7 and 3.2:");
     max(5.7, 3.2);

     int[] numbers = {4, 15, 7, 9, 20};
     System.out.println("Max in array: " + max(numbers, numbers.length)); 
  }
  
}
