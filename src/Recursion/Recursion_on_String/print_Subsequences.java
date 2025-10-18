package Recursion.Recursion_on_String;

import java.util.Scanner;

public class print_Subsequences {
    static void printSSQ(String s, String currSSQ){
        // base case
        if(s.length() == 0){
            System.out.println(currSSQ);
            return;
        }
        // self work
        char currAns = s.charAt(0);
        String remainingString = s.substring(1);

        // recursive work
        // currChar--> chooses to be a part of currSSQ
        printSSQ(remainingString,currSSQ+currAns);
        // currChar--> does not chooses to be a part of currSSQ
        printSSQ(remainingString,currSSQ);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printSSQ("abc","");

    }
}
