package HashMap.Lecture_60;
import java.util.*;
public class HashMap_Methods {
    static void HashMapMethods(){
        //Syntax
        Map<String,Integer> mp = new HashMap<>();

        //Adding Elements
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Kratika",143);
        mp.put("Aarushi",1432);
        mp.put("Ritesh",99);

        //Getting value of a key from the HashMap
        System.out.println(mp.get("Kratika")); // 143
        System.out.println(mp.get("Riya")); // null

        //Changing/Updating value of a key from the HashMap
        mp.put("Ritesh",100);// Ritesh -> 100
        System.out.println(mp.get("Ritesh"));// 100

        //Removing a pair from the HashMap
        System.out.println(mp.remove("Lav")); // 17
        System.out.println(mp.remove("Riya")); // null

        //Checking if a key is in the HashMap
        System.out.println(mp.containsKey("Lav"));// false
        System.out.println(mp.containsKey("Aarushi")); // true

        //Adding a new entry only if the key doesn't exist already
        mp.putIfAbsent("Ayushi",104);// will enter
        mp.putIfAbsent("Yash",55);// will not enter -> Bcoz Yash is already exist

        //Get all key in the HashMap
        System.out.println(mp.keySet());

        //Get all values in the HashMap
        System.out.println(mp.values());

        //Get all entries in the HashMap
        System.out.println(mp.entrySet());

        //Traversing all entries of HashMap - multiple methods
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n" , key , mp.get(key));
        }

        System.out.println();

        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n" , e.getKey() , e.getValue());
        }

        System.out.println();

        for(var e :mp.entrySet() ){
            System.out.printf("Age of %s is %d\n" , e.getKey() , e.getValue());
        }
    }
    public static void main(String[] args) {
       HashMapMethods();
    }
}
