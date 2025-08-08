package practise;

public class Main
{
	public static void main(String[] args) {
    		int[] arr={100, 4, 200, 1, 3, 2};
    		int i,j;
    		int count=1;
    		for(i=0;i<arr.length-1;i++){
    		    for(j=i+1;j<arr.length;j++){
    		        if(arr[j]<arr[i]){
    		            int temp=arr[j];
    		            arr[j]=arr[i];
    		            arr[i]=temp;
    		        }
    		    }
    		    
    		}
    		for(i=0;i<arr.length-1;i++){
    		    if(arr[i]+1==arr[i+1]){
    		    count++;
    		        
    		    }
    		}
    		System.out.println(count);
    		
    		for(i=0;i<arr.length;i++){
    		    System.out.print(arr[i]+" ");
    		}
	}
}
