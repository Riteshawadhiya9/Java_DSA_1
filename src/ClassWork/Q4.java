package ClassWork;
import java.util.*;
public class Q4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//
//        String counted = "";
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == ' ' || counted.indexOf(ch) != -1) continue;
//
//            int count = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(j) == ch) count++;
//            }
//
//            System.out.println(ch + " = " + count);
//            counted += ch;
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        int[]freq = new int[256];
        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);
            if(ch !=' '){
            freq[ch]++;
            }
        }
        System.out.println("\n Charecter Frequencies");
        for(int i = 0 ; i < freq.length ;i++){
            if(freq[i]>0){
                System.out.println((char)i+" "+freq[i]);
            }
        }
    }
}