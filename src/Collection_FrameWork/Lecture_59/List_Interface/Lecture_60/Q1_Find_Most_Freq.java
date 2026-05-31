package Collection_FrameWork.Lecture_59.List_Interface.Lecture_60;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class Q1_Find_Most_Freq {
    private static void bruteFindFreq(int[]arr){
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        Arrays.sort(arr);

        int maxFreq = 1;
        int currentFreq = 1;

        int mostFrequentElement = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                currentFreq++;
            } else {
                currentFreq = 1;
            }

            // update maximum frequency
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                mostFrequentElement = arr[i];
            }
        }

        System.out.println(
                mostFrequentElement + " appears " +
                        maxFreq + " times"
        );
    }

    private static Map<Integer, Integer> buildFrequencyMap(int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>();

        for (int elem : arr) {

            if (!freq.containsKey(elem)) {
                freq.put(elem, 1);
            } else {
                freq.put(elem, freq.get(elem) + 1);
            }
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,3,2,1,4,1};
        System.out.println("Original Array : "+Arrays.toString(arr));

        bruteFindFreq(arr);

        Map<Integer,Integer> freq = new HashMap<>();
        for(int elem : arr){
            if(!freq.containsKey(elem)){
                freq.put(elem,1);
            }else{
                freq.put(elem , freq.get(elem)+1);
            }
        }
        System.out.println("Frequency Map ");
        System.out.println(freq.entrySet());

        int mxFreq = 0;
        int ansKey = -1;
        for(var e : freq.entrySet()){
            if(e.getValue() > mxFreq){
                mxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println(ansKey);


//        Map<Integer, Integer> result = buildFrequencyMap(arr);
//
//        System.out.println("Frequency Map: by method");
//        System.out.println(result);
    }
}
