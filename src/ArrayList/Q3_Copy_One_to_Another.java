package ArrayList;

import java.util.ArrayList;

public class Q3_Copy_One_to_Another {
    public static void main(String[] args) {

// Using Constructor (Shallow Copy)
        ArrayList<String> list = new ArrayList<>();
        list.add("Ritesh");
        list.add("I");
        list.add("Love");
        list.add("You");
        list.add("Kratika");

        ArrayList<String> list2 = new ArrayList<>(list);

        System.out.println("Original : "+ list);
        System.out.println("Copy : "+list2);

        list.add("Ummaaaaa💋💓");
        System.out.println("Original after updation : "+list);
        System.out.println("Copy remains unchanged : "+list2);


        System.out.println("\n");

// USING addAll() METHOD
        ArrayList<String> source = new ArrayList<>();
        source.add("Apple");
        source.add("Banana");
        source.add("Cherry");

        ArrayList<String> destination = new ArrayList<>();

        // Copy all elements
        destination.addAll(source);

        System.out.println("Source: " + source);       // [Apple, Banana, Cherry]
        System.out.println("Destination: " + destination); // [Apple, Banana, Cherry]

        // Add more to destination
        destination.add("Mango");
        System.out.println("Destination after adding: " + destination); // [Apple, Banana, Cherry, Mango]
        System.out.println("Source remains same: " + source);          // [Apple, Banana, Cherry]

    }
}
