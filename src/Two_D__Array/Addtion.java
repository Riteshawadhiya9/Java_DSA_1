package Two_D__Array;
import java.util.*;
public class Addtion {
    static void printMatrix(int matrix[][]){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrix(int mat1[][] , int r1 , int c1 , int mat2[][] ,int r2 , int c2){

        if(r1 !=  r2 || c1 != c2){
            System.out.println("Wrong input - Addition not possible : ");
            return null;
        }
        int [][]add = new int [r1][c1];
        for(int i = 0 ; i  < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                add[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
//        System.out.println("Addition of Matrix 1 & Matrix 2");
//        printMatrix(add);
        return add;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter no.of Rows for Matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter no.of Columns for Matrix 1 ");
        int c1 = sc.nextInt();
        int mat1[][] = new int[r1][c1];
        System.out.println("Enter 1st Matrix : ");
        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter no.of Rows for Matrix 2 ");
        int r2 = sc.nextInt();
        System.out.println("Enter no.of Columns for Matrix 2 ");
        int c2 = sc.nextInt();
        int mat2[][] = new int[r2][c2];
        System.out.println("Enter 2nd Matrix : ");
        for(int i = 0 ; i < r2 ; i++){
            for(int j = 0 ; j < c2 ; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(mat1);
        System.out.println("Matrix 2");
        printMatrix(mat2);
        int [][] result =addMatrix(mat1,r1,c1,mat2,r2,c2);
        if(result != null){
            System.out.println("Addition of Matrix 1 & Matrix 2");
            printMatrix(result);
        }
    }
}
