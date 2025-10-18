package Logical_Questions_Lec_8;

public class print_Substring {
    public static void main(String[] args) {
        String str = "1234";
        for(int i = 0 ; i < str.length() ; i++){
            for(int j = i+1 ; j <= str.length()  ;j++){
                System.out.print(str.substring(i,j)+" ");
            }
//            System.out.println();
        }
    }
}
