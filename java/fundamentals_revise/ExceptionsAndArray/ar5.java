//max sum from the subarray
package ExceptionsAndArray;

public class ar5 {
  public static void main(String[] args) {
      //using Kadane’s Algorithm
      int[]  arr = {-2, -3, 4, -1, -2, 1, 5, -3};
      int currentSum=arr[0];
      int maxSum=arr[0];

      int start=0;
      int end=0;
      int tempstart=0;

      for(int i=1;i<arr.length;i++){
        if(arr[i]>currentSum+arr[i]){
          currentSum=arr[i];
          tempstart=i;
        }else{
          currentSum += arr[i];
        }
        if(currentSum>maxSum){
          maxSum=currentSum;
          start=tempstart;
          end=i;
        }
      }

       System.out.println("Maximum subarray sum is: " + maxSum);
       System.out.print("Subarray: ");
       for(int i = start; i <= end; i++) {
          System.out.print(arr[i] + " ");
       }

  }
  
}



/*Brute force approach
  int[]  arr = {-2, -3, 4, -1, -2, 1, 5, -3};
      
      int maxSum=Integer.MIN_VALUE;

      for(int i=0;i<arr.length;i++){
        int currentSum=0;
        for(int j=i;j<arr.length;j++){
          currentSum += arr[j];

          if(currentSum>maxSum){
          maxSum=currentSum;
          }
        }
        
      }
      System.out.println("Maximum subarray sum is: " + maxSum);
 */