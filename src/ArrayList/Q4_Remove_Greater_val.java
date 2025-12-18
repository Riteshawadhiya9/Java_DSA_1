package ArrayList;

import java.util.ArrayList;

public class Q4_Remove_Greater_val {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(150);
        list.add(250);
        list.add(50);

        int maxValue = 200;
        System.out.println("Before: " + list);  // [100, 200, 300, 150, 250, 50]

        // Iterate backwards to avoid index shifting issues
        for(int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) > maxValue) {
                list.remove(i);
            }
        }

        System.out.println("After removing > " + maxValue + ": " + list);  // [100, 200, 150, 50]
    }
}
