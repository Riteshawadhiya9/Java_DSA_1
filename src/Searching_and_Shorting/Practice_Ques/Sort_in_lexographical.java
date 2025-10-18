package Searching_and_Shorting.Practice_Ques;

public class Sort_in_lexographical {
    static  void solution(String[] fruits){
        int n = fruits.length;
        for(int i = 0 ; i < n-1  ; i++){
            int min_idx = i;
            for(int j = i+1 ; j<n ; j++){
                if(fruits[j].compareTo(fruits[min_idx])<0){
                    min_idx=j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_idx];
            fruits[min_idx] = temp;
        }
    }
    public static void main(String[] args) {
        String [] fruits = {"papaya","lime","watermelon","apple","mango","kiwi"};
        solution(fruits);
        for(String val : fruits){
            System.out.print(val+" ");
        }
    }
}
