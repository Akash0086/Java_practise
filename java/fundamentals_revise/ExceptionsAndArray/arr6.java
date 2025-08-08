//print nxn matrix elements in spiral
package ExceptionsAndArray;

public class arr6 {
  public static void main(String[] args) {
      int[][] matrix={{1,  2,  3,  4},
                      {5,  6,  7,  8},
                      {9,  10, 11, 12},
                      {13, 14, 15, 16}};
      int n=matrix.length;                
      int top=0;
      int bottom=n-1;
      int left=0;
      int right=n-1;

      while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
          System.out.print(matrix[top][i]+" ");
        }
        top++;

        for(int i=top;i<=bottom;i++){
          System.out.print(matrix[i][right]+" ");
        }
        right--;
      
      
      if(top<=bottom){
        for(int i=right;i>=left;i--){
          System.out.print(matrix[bottom][i]+" ");
        }
        bottom--;
      }

      for(int i=bottom;i>=top;i--){
        System.out.print(matrix[i][left]+" ");
      }
      left++; 
      
    }

  }
}
