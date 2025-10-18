package JavaOperators_Lec_5;
import java.util.Scanner;
public class RelationOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your first value : ");
        int a = sc.nextInt();//10
        System.out.println("Enter your Second value : ");
        int b = sc.nextInt();//15
    
        System.out.println(a == b);//false
        System.out.println(a != b);//true
        System.out.println(a > b);//false
        System.out.println(a < b);//true
        System.out.println(a >= b);//false
        System.out.println(a <= b);//true
     }   
    }
    
    

