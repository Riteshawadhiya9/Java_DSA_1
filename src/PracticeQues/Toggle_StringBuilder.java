package PracticeQues;

import java.util.Scanner;

public class Toggle_StringBuilder {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        StringBuilder sb = new StringBuilder(sc.nextLine());
//        for(int i = 0 ; i < sb.length() ; i++){
//            boolean flag = true ; // true --> Capital
//            char ch = sb.charAt(i);
//            if(ch == ' ') continue;
//            if(ch >='0' && ch <= '9'){
//                sb.deleteCharAt(i);
//                i--;
//                continue;
//            }
//            int ascii = (int)ch;
//            if(ascii >= 97) flag = false;
//            if(flag){
//                ascii += 32;
//                char dh = (char) ascii;
//                sb.setCharAt(i , dh);
//            }else{
//                ascii -= 32;
//                char dh = (char)ascii;
//                sb.setCharAt(i ,dh);
//            }
//        }
//        System.out.println(sb);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for(int i = 0 ; i < sb.length() ; i++){
            boolean flag = true;
            char ch = sb.charAt(i);
            if(ch == ' ')continue;
            if(ch >= '0' && ch <= '9'){
                sb.deleteCharAt(i);
                i--;
                continue;
            }
            int ascii = (int)ch;
            if(ascii >= 97) flag = false;
            if(flag){
                ascii += 32;
                char dh = (char) ascii;
                sb.setCharAt(i,dh);
            }else{
                ascii -= 32;
                char dh = (char)ascii;
                sb.setCharAt(i,dh);
            }
        }
        System.out.println(sb);
    }
}
