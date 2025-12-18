package ArrayList;
import java.util.*;

public class Level_2 {

    public static Integer findSum(ArrayList<Integer> l1){
        int sum = 0;
        for(int i = 0 ; i < l1.size() ; i++){
            sum += l1.get(i);
        }
        return sum;
    }
    public static int findMax(ArrayList<Integer> l1){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < l1.size() ; i++){
            if(l1.get(i) > max){
                max = l1.get(i);
            }
        }
        return max;
    }
    public static int findMin(ArrayList<Integer> l1){
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < l1.size() ; i++){
            if(l1.get(i) < min){
                min = l1.get(i);
            }
        }
        return min;
    }
    public static int[] cntOddEven(ArrayList<Integer>l){
        int odd = 0;
        int even = 0;
        for(int num : l) {
            if(num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{odd, even};
    }
    public  static boolean isExists(ArrayList<Integer> l){
        boolean ans = l.contains(Integer.valueOf(-2));
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(-2);
        l.add(4);
        System.out.println("All Elements sum is : "+ findSum(l));
        System.out.println("Max Elem is : "+findMax(l));
        System.out.println("Min Elem is : "+findMin(l));

        int[] result = cntOddEven(l);
        System.out.println("Odd numbers: " + result[0]);
        System.out.println("Even numbers: " + result[1]);

        System.out.println("Elem exists or not : "+isExists(l));


    }
}
