package Two_D__Array;

import java.util.Scanner;

public class Spiral_n_AntiClockWise {
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
            // leftColumn --> topRow to bottomRow
            for(int j = topRow; j <= bottomRow && count <= n*n ;j++){
                ans[j][leftColumn] = count;
                count++;
            }
            leftColumn++;

            // bottomRow --> leftColumn to rightColumn
            for(int i = leftColumn ; i<= rightColumn && count <= n*n ; i++){
                ans[bottomRow][i]=count++;
            }
            bottomRow--;

            // rightColumn --> bottomRow to topRow
            for(int j = bottomRow ; j >= topRow && count <= n*n; j--){
                ans[j][rightColumn] = count++;
            }
            rightColumn--;

            // topRow --> rightColumn to leftColumn
            for(int i = rightColumn ; i >= leftColumn && count <= n*n ;i--){
                ans[topRow][i] = count++;
            }
            topRow++;
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
