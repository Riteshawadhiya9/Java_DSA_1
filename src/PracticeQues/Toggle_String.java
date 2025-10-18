package PracticeQues;

import java.util.Scanner;

public class Toggle_String {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String str = "RiteSH AwadHIYA";
//        System.out.println(str);
////        StringBuilder sb = new StringBuilder(str);
//        for(int i = 0 ; i < str.length() ; i++){
//            boolean flag = true;
//            char ch = str.charAt(i);
//            if(ch == ' ') continue;
////            if(ch >= '0' && ch <= '9'){
////                continue;
////            }
//            int ascii = (int) ch;
//            if(ascii >= 97) flag = false;
//            if(flag){
//                ascii += 32;
//                char dh = (char)ascii;
//                 str = str.substring(0,i)+dh+ str.substring(i+1);
//            }else{
//                ascii -= 32;
//                char dh = (char) ascii;
//                str = str.substring(0,i) + dh + str.substring(i+1);
//            }
//        }
//        System.out.println(str);
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    for(int i = 0 ; i < s.length() ; i++){
        boolean flag = true;
        char ch = s.charAt(i);
        if(ch == ' ') continue;
        int ascii = (int)ch;
        if(ascii >= 97) flag = false;
        if(flag){
            ascii += 32;
            char dh = (char) ascii;
            s = s.substring(0,i)+ dh + s.substring(i+1);
        }else{
            ascii -= 32;
            char dh = (char) ascii;
            s = s.substring(0,i) + dh + s.substring(i+1);
        }
    }
    System.out.println(s);
}
}
