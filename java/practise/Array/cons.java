package practise.Array;

public class cons {

  public int findMaxCons(int[] arr,int n){
    int count=0;
    int max_count=0;
    for(int num : arr){
      if(num==1){
        count++;
        max_count=Math.max(count,max_count);
      }else 
      count=0;
      
    }
    return max_count;
    
  }

  public  static void main(String[] args){
    int[] arr={1,1,2,1,1,1,0,1,1,1,1,1};
    int n=arr.length;
    cons m=new cons();
    System.out.println("Maximum continuos ones is "+m.findMaxCons(arr,n));


  }

  
}
