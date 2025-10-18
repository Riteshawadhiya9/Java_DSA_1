package Two_D__Array;

import java.util.Scanner;

public class RotateMatrix {
    public static void printMatrix(int [][]arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void reverse(int arr[]){
        int i = 0 , j = arr.length-1;
        while(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        }
    }

    public static void transposeInplace(int [][] arr ,int r , int c){
        for(int i = 0 ; i < r ; i++){
            for(int j = i ; j < c ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void rotate(int arr[][] ,int n){
   transposeInplace(arr , n , n);
   for(int i = 0 ; i < n ; i++){
        reverse(arr[i]);
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no rows and column ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int [r][c];
        System.out.println("Enter "+r*c+" elements ");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Rotate of Matrix ");
        rotate(mat , r);
        printMatrix(mat);
    }
}
