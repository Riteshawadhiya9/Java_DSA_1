package Two_D__Array;

import java.util.Scanner;

public class Spiral_AntiClockWise {
    public static void printMatrix(int [][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void spiral(int [][]matrix , int r , int c){
        int topRow = 0 , bottomRow = r-1 , leftCol = 0 , righCol = c-1;
        int totalElements = 0;
        while(totalElements < r*c){
            // leftCol --> topRow to BottomRow
            for(int i = topRow ; i <= bottomRow && totalElements < r*c ; i++){
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;

            // bottomRow --> leftCol to rightCol
            for(int j = leftCol ; j <= righCol && totalElements < r*c ; j++){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            // rightCol --> bottomRow to topRow
            for(int  i = bottomRow ; i>=topRow && totalElements < r*c ; i--){
                System.out.print(matrix[i][righCol]+" ");
                totalElements++;
            }
            righCol--;

            // topRow --> rightCol to leftCol
            for(int j = righCol ; j >= leftCol && totalElements < r*c ; j--){
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter row and column ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int [r][c];
        System.out.println("Enter "+r*c+" elements");
        for(int i = 0 ; i < r ;i++){
            for(int j = 0 ; j < c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix ");
        printMatrix(matrix);
        System.out.println();
        System.out.println("Spiral Matrix");
        spiral(matrix,r,c);
    }
}
