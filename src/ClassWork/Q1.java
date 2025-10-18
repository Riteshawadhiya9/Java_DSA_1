package ClassWork;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter Input -> ");
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println("Give index of the given String :");
        int n = sc.nextInt();
        char ch = s.charAt(n);
        System.out.println(ch);
    }
}
