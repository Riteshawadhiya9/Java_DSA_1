package ArrayList;
import java.util.*;

public class Level_1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input (though not used in this example)
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList of Integers
        ArrayList<Integer> l1 = new ArrayList<>();

        // Adding elements to the ArrayList
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(10);

        // Method 1: Using traditional for loop with index
        System.out.println("Method 1: Traditional for loop");
        // Loop through all elements using index
        for(int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i)); // get element at index i
        }

        // Method 2: Using for-each loop (enhanced for loop)
        System.out.println("\nMethod 2: For-each loop");
        // For-each loop: 'value' directly holds each element from l1
        for(int value : l1){
            System.out.println(value); // Directly print the value
        }

        // Get element at specific index
        Integer idx = l1.get(2); // Gets element at index 2 (which is 7)
        System.out.println(idx); // Print the value (7)

        // Get and print the size of the ArrayList
        System.out.println("\n Size is : "+l1.size());

        // Check if ArrayList is empty
        if(l1.size()<=0){
            System.out.println("List is empty");
        }else{
            System.out.println("Not Empty");
        }

        // Add element at specific index (index 0 with value 4)
        // Existing elements shift to the right
        l1.add(0,4);
        System.out.println(l1); // Print entire ArrayList

        // Remove the last element (element at last index)
        l1.remove(l1.size()-1);
        System.out.println(l1);

        l1.remove(Integer.valueOf(6)); // remove 6 , not index 6

        // Replace element at index 1 with new value 100
        l1.set(1,100);
        System.out.println(l1);

        // Clear all elements from the ArrayList
        l1.clear();
        System.out.println(l1); // Prints empty brackets: []
    }
}