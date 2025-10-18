package Recursion.Recursion_on_String;

import java.util.*;
public class Remove_Occurance_of_a {
    static String iremoveA(String s){
        String ans = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != 'a'){
                ans += s.charAt(i);
            }
        }
        return ans;
    }

    static String removeA2(String s){
        // base case
        if(s.length() == 0){
            return " ";
        }
        // recursive work
        String smallAns = removeA2(s.substring(1));
        char currAns = s.charAt(0);
        // self work
        if(s.charAt(0) == 'a'){
            return smallAns;
        }else{
            return currAns + smallAns;
        }
    }

    static String removeA(String s , int idx){
        // base case
        if(idx == s.length()){
            return " ";
        }
        // recursive work
        String smallAns = removeA(s,idx+1);
        char currAns = s.charAt(idx);
        // selfwork
        if(currAns == 'a'){
            return smallAns;
        }else{
            return currAns + smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        String s = sc.nextLine();
        System.out.println(iremoveA(s));
        System.out.println(removeA(s,0));
        System.out.println(removeA2(s));
    }
}
