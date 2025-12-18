package Two_D__Array;

import java.util.Scanner;

public class Find_Mat_Sum {
    public static void print(int[][]mat){
        int r = mat.length;
        int c = mat[0].length;
        for(int i = 0 ; i<r ; i++){
            for(int j = 0 ; j < c ; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int findSum(int[][] mat , int l1 , int r1 , int l2, int r2){
        int sum = 0;
        for(int i = l1 ; i<= l2 ; i++){
            for(int j = r1 ; j <= r2 ; j++){
                sum += mat[i][j];
            }
        }
        return sum;
    }

    public static void findPrefixSumMat(int[][]mat){
        int r = mat.length;
        int c = mat[0].length;
        for(int i = 0; i < r ; i++){
           for(int  j = 1 ; j < c ; j++){
               mat[i][j] += mat[i][j-1];
           }
        }
    }

    public static int findSum2(int[][]mat , int l1,int r1 , int l2 , int r2){
        int sum = 0;
        findPrefixSumMat(mat);

        for(int i = l1 ; i <= l2 ; i++){
            if(r1 >= 1){
                sum += mat[i][r2] - mat[i][r1-1];
            }else{
                sum += mat[i][r2];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Row & Col ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter "+r*c+" elements");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        print(mat);

        System.out.println("Enter Reactangle Bundries l1=row r1=col l2 r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum is : "+ findSum(mat,l1,r1,l2,r2));
        System.out.println("Rectangle sum is : "+ findSum2(mat,l1,r1,l2,r2));


    }
}
