package Two_D__Array;

import java.util.Scanner;

public class Spiral_n_ClockWise {
    public static void printMatrix(int arr[][]){
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] makeSpiralMatrix(int n){
        int [][]ans = new int[n][n];
        int topRow = 0, bottomRow = n-1 ,rightColumn = n-1 , leftColumn = 0;
        int count =1;
        while(count <= n*n){
            // topRow --> leftColumn to rightColumn
            for(int j = leftColumn ; j <= rightColumn && count <= n*n ;j++){
                ans[topRow][j] = count;
                count++;
            }
            topRow++;

            // rightColumn --> topRow to bottomRow
            for(int i = topRow ; i<= bottomRow && count <= n*n ; i++){
                ans[i][rightColumn]=count++;
            }
            rightColumn--;

            // bottomRow --> rightColumn to leftColumn
            for(int j = rightColumn ; j >= leftColumn && count <= n*n; j--){
                ans[bottomRow][j] = count++;
            }
            bottomRow--;

            // leftColumn --> bottomRow to topRow
            for(int i = bottomRow ; i >= topRow && count <= n*n ;i--){
                ans[i][leftColumn] = count++;
            }
            leftColumn++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        System.out.println("Spiral Matrix");
        int ans[][] = makeSpiralMatrix(n);
        printMatrix(ans);
    }
}
