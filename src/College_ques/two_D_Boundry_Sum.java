package College_ques;
import java.util.*;
public class two_D_Boundry_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

      
        int[][] arr = new int[rows][cols];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        // Top row (left to right)
        for (int j = 0; j < cols; j++) {
            sum += arr[0][j];
        }

        // Right column (top to bottom)
        for (int i = 1; i < rows; i++) {
            sum += arr[i][cols - 1];
        }

        // Bottom row (right to left)
        if (rows > 1) {
            for (int j = cols - 2; j >= 0; j--) {
                sum += arr[rows - 1][j];
            }
        }

        // Left column (bottom to top)
        if (cols > 1) {
            for (int i = rows - 2; i > 0; i--) {
                sum += arr[i][0];
            }
        }
        System.out.println("Sum of boundary is : " + sum);
    }
}

