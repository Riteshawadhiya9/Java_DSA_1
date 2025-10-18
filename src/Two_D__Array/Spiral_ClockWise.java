package Two_D__Array;

import java.util.Scanner;

public class Spiral_ClockWise {
    public static void printMatrix(int [][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void spiral(int[][] arr , int r ,int c){
        int topRow = 0 , bottomRow = r-1 , leftColumn = 0 , rightColumn = c-1;
        int total= 0;
        while(total < r*c){
            // topRow --> leftColumn to rightColumn
            for(int j = leftColumn ; j <= rightColumn && total < r*c ; j++){
                System.out.print(arr[topRow][j]+" ");
                total++;
            }
            topRow++;

            // rightColumn --> topRow to bottomRow
            for(int i= topRow ; i <= bottomRow && total < r*c ;i++){
                System.out.print(arr[i][rightColumn]+" ");
                total++;
            }
            rightColumn--;

            // bottomRow --> rightColumn to leftColumn
            for ( int j = rightColumn ; j >= leftColumn && total < r*c ; j--){
                System.out.print(arr[bottomRow][j]+" ");
                total++;
            }
            bottomRow--;

            // leftColumn --> bottomRow to topRow
            for(int i = bottomRow ; i >= topRow && total < r*c ; i--){
                System.out.print(arr[i][leftColumn]+" ");
                total++;
            }
            leftColumn++;
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter row ans column ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];
        System.out.println("Enter "+r*c+" elements ");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println();

        System.out.println("Spiral Matrix");
        spiral(matrix,r,c);
//        printMatrix(matrix);
    }
}
