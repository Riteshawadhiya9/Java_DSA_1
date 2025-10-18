package Recursion.Recursion_on_String;
import java.util.ArrayList;
import java.util.Scanner;

public class Subsequences {
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length() == 0){
            ans.add("");
            return ans;
        }
        char currAns = s.charAt(0);
        ArrayList<String > smallAns = getSSQ(s.substring(1));
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(currAns+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<String > ans = getSSQ("abc");
        for(String ss :ans){
            System.out.println(ss);
        }
    }
}
