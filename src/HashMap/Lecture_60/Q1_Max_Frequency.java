package HashMap.Lecture_60;
import java.util.*;
public class Q1_Max_Frequency {
    public static void findMaxFreq(int[] arr){
    Map<Integer,Integer> freq = new HashMap<>();
    for(var el : arr){
        if(!freq.containsKey(el)){
            freq.put(el,1);
        }else{
            freq.put(el, freq.get(el)+1);
        }
    }
        System.out.print("Frequencies : ");
        System.out.println(freq.entrySet());
        int mxFreq = 0 , ansKey = -1;
        for(var e : freq.entrySet()){
            if(e.getValue()>mxFreq){
                mxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.printf("%d has max Frequency and it occures %d times ",ansKey,mxFreq);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,3,22,2,2,2,2,2,2,2,3,4,5,2,3,543,1,1,1,3,433,1,21,21,1,1};
        findMaxFreq(arr);
    }
}
