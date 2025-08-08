package Collections;

import java.util.*;

public class col4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        // Add same elements in the same order
        int[] values = {10, 20, 30, 40, 50};

        for (int val : values) {
            list.add(val);
            set.add(val);
        }

        // Print ArrayList
        System.out.println("ArrayList iteration order:");
        for (int val : list) {
            System.out.print(val + " ");
        }

        System.out.println();

        // Print HashSet
        System.out.println("HashSet iteration order:");
        for (int val : set) {
            System.out.print(val + " ");
        }
    }
}
