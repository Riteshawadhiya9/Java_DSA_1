package Collection_FrameWork.Lecture_59.List_Interface.Lecture_60;
//import HashMap.Lecture_60.HashMap_Methods;

import java.util.*;

public class HashMapExample {

    static void hashMapMethod(){
        // syntax
        Map<String, Integer> mp = new HashMap<>();
        // Adding Elem
        mp.put("Akash" , 21);
        mp.put("Ritesh" , 11);
        mp.put("Madhu" , 23);
        mp.put("Satyam" , 12);
        mp.put("Hari" , 82);
        mp.put("Kuttu" , 91);

        // Getting value of a key from the hashMap
        System.out.println(mp.get("Ritesh")); // 11
        System.out.println(mp.get("Mittu")); // null

        // Changing / Updating of a key in the HashMap
        mp.put("Ritesh" , 21);
        System.out.println(mp.get("Ritesh"));// Ritesh -> 21
        mp.put("Akash" , 16);
        System.out.println(mp.get("Akash"));// Akash -> 16
        System.out.println(mp.get("Hari")); // 82

        // Remove a pair from the HashMap
        System.out.println(mp.remove("Kuttu")); // 91
        System.out.println(mp.remove("Harami")); // null

        // Checking if a key in the HashMap
        System.out.println(mp.containsKey("Aman"));// false;
        System.out.println(mp.containsKey("Hari")); // true

        // Adding a new entry only if the new key doesn't exist already
//        if(mp.containsKey("Aman")) mp.put("Riya", 31); // Approact 1
        mp.putIfAbsent("Riye",25); // will enter
        mp.putIfAbsent("Ritesh", 200) ; // will not enter

        // Get all the key in the HashMap
        System.out.println(mp.keySet());

        // Get all the values in the HashMap
        System.out.println(mp.values());


        // Get al the entries in the HashMap
        System.out.println(mp.entrySet());

        // Traversing all entries of HashMap - Multiple methods
        for(String key : mp.keySet()){
            System.out.printf("Marks of %s is %d : \n", key, mp.get(key));
        }



    }
    public static void main(String[] args) {
        hashMapMethod();
    }
}
