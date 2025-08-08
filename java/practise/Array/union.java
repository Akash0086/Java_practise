package practise.Array;
import java.util.*;

public class union {
    // Method to remove duplicates and return as List
    public List<Integer> removeDup(int[] arr, int n) {
        List<Integer> arrList = new ArrayList<>();
        for (int num : arr) {
            arrList.add(num);
        }
        Set<Integer> uniqueSet = new HashSet<>(arrList);
        return new ArrayList<>(uniqueSet);
    }

    // Method to create union of array elements
    public Set<Integer> unionArray(int[] arr, int n) {
        Set<Integer> unionSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            unionSet.add(arr[i]);
        }
        return unionSet;
    }

    public static void main(String[] args) {
        // Define arrays
        int[] arr1 = {1, 3, 2, 3, 1, 2, 3, 4, 5, 4};
        int[] arr2 = {1, 3, 5, 6, 1, 2};
        
        // Create object
        union obj = new union();
        
        // Test removeDup with arr1
        System.out.println("After removing duplicates from arr1: " + 
            obj.removeDup(arr1, arr1.length));
        
        // Test removeDup with arr2
        System.out.println("After removing duplicates from arr2: " + 
            obj.removeDup(arr2, arr2.length));
        
        // Test unionArray with arr1
        System.out.println("Union of arr1 elements: " + 
            obj.unionArray(arr1, arr1.length));
    }
}