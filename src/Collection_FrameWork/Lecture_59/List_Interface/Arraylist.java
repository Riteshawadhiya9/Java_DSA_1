package Collection_FrameWork.Lecture_59.List_Interface;
import java.util.*;
public class Arraylist {
    static void arrayListExample(){
        ArrayList<Integer> l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // 1 2 3
        System.out.println(l.get(2)); // 3
        l.set(1,10);
        System.out.println(l); // 1 20 3
        System.out.println(l.contains(2)); // false
        System.out.println(l.contains(10)); // true

    }
    public static void main(String[] args) {
        arrayListExample();
    }
}
