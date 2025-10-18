package Strings_or_StringBuilders;

import java.util.*;

public class Q1_Toggle_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
//        int n = sb.length();
        System.out.println(sb);
        for(int i = 0 ; i < sb.length(); i++){
            // A --> a
            // Check  -> Alphabet -> small ,  capital
            boolean flag = true; //true --> Capital
            char ch = sb.charAt(i);// A
            if(ch==' ')continue;

//            if(ch >= '0' && ch <= '9'){
//                sb.deleteCharAt(i);
//                i--;
//                continue;
//            }

            int ascii = (int)ch;// 65

            if(ascii >= 48 && ascii <= 57){
                sb.deleteCharAt(i);
                i--;
                continue;
            }
            if(ascii >= 97) flag = false; // small
            if(flag == true){ // capital
                ascii += 32;
                char dh = (char)ascii;// a
                sb.setCharAt(i,dh);
            }else{ // small
                ascii -= 32;
                char dh = (char)ascii;
                sb.setCharAt(i,dh);
            }
        }
        System.out.println(sb);
    }
}
