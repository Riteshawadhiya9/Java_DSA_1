package Recursion.Recursion_9_Lec_36;

import java.util.Scanner;

public class Letter_Combinations_of_a_Phone_Number_LC_17 {
    static void keypad(String digit, String[]kp ,String result){//"23" --> kp[2]
        if(digit.length()==0){
            System.out.print(result+" ");
            return;
        }
        int currNum = digit.charAt(0)-'0';//2
        String currChoices = kp[currNum];//"abc"
        for(int i = 0 ; i < currChoices.length() ; i++){
            keypad(digit.substring(1),kp,result+currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String digit = "23";
        String result = "";
        String [] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        keypad(digit,kp,result);
    }
}
