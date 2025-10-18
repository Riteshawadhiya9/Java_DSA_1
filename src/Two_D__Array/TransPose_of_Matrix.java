package Two_D__Array;

import java.util.Scanner;

public class TransPose_of_Matrix {
    public static void printMatrx(int [][] arr){
        int n =arr.length;
        for(int  i = 0 ; i < n ; i++){
            for(int j =0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
     public static int[][] transpose(int [][]arr, int r ,int c){
        int ans[][] = new int[c][r];
        for(int i = 0 ; i < c ;i++){
            for(int j = 0 ; j < r ;j++){
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
     }

     public static void transposeInplace(int [][]arr ,int r , int c){// This method only for Square Matrix
        for(int i = 0 ; i < r ; i++){
            for(int j = i ;  j < c ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter rows and column ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat [][] = new int [r][c];
        System.out.println("Enter "+r*c+" elemets ");
        for(int i = 0 ; i <  r ; i ++){
            for(int j = 0 ; j < c ; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix before Transpose ");
        printMatrx(mat);
        System.out.println("Matrix After Transpose ");
//        int ans[][] =  transpose(mat ,r,c);
//        printMatrx(ans);
        transposeInplace(mat , r , c);
        printMatrx(mat);
    }
}
