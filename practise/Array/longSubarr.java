package practise.Array;
public class longSubarr {
  public static void main(String[] args){
  int[] arr={1,2,3,4,5,1,1,1};
  int num=3,maxlen=0;
  int start=-1;
  int end=-1;
  for(int i=0;i<arr.length;i++){
    int sum=0;
    for(int j=i;j<arr.length;j++){
      sum+=arr[j];
      if(sum==num){
          maxlen=Math.max(maxlen,j-i-1);
          start=i;
          end=j;
      }
          
	}
  }
  
  System.out.print("{");
  for(int i=start;i<=end;i++){
    
      System.out.print(arr[i]);
      if(i !=end){
        System.out.print(",");
      }
  }
  System.out.print("}");

  }
  
}
