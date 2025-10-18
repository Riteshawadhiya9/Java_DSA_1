package Two_D__Array;
import java.util.Scanner;

public class Multiplication {
    public static void printMatrix(int [][]arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] Multiply(int[][] mat1, int r1 ,int c1 ,int [][]mat2 ,int r2 , int c2){
        if(c1!=r2){
            System.out.println("Wrong Dimension :- Multiplication not possible :");
            return null;
        }
        int multi[][]  = new int[r1][c2];
        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c2 ; j++){
                for(int k = 0 ; k < c1 ; k++){
                    multi[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("Multiplication of Matrix1 & Matrix2 ");
        return multi;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("Enter row and column of Matrix 1 :");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int mat1[][] = new int [r1][c1];
        System.out.println("Enter "+r1*c1+" Elements ");
        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter row and column of Matrix 2 :");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int mat2[][] = new int [r2][c2];
        System.out.println("Enter "+r2*c2+" Elements ");
        for(int i = 0 ; i < r2 ; i++){
            for(int j = 0 ; j < c2 ; j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(mat1);
        System.out.println("Matrix 2");
        printMatrix(mat2);
        int multi[][] = Multiply(mat1 ,r1 ,c1 ,mat2 ,r2, c2);
        if(multi != null) {
            printMatrix(multi);
        }
    }
}
