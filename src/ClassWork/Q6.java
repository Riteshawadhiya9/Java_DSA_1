package ClassWork;
import java.util.*;
public class Q6 {
    public static boolean check(String s1, String s2){

        return s1.equals(s2);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Enter 1st String : ");
       String s1 = sc.nextLine();
        System.out.println("Enter 2nd String : ");
       String s2 = sc.nextLine();
       if(check(s1,s2)){
           System.out.println("Both String refers to the same String literal in the same string pool ");
       }else{
           System.out.println("Both String refers to DIFFERENT objects ");
       }
    }
}
