import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//       Scanner  sc = new Scanner(System.in);
//       int n = sc.nextInt();
//        int sum = 0 ;
//        int num = 1;
//       while ( num <= n){
//           sum += num;
//           num++;
//           System.out.println(sum);
//       }
//        //System.out.println(sum);
//    }
//}

    // Que --> Prime number
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter number of queries");
       int t = sc.nextInt();
       while(t-->0){
           System.out.println("Enter a number :");
           int num = sc.nextInt();
           int i;
           if(num == 1){
               System.out.println("It's a prime number");
           }
           for( i = 2; i < num ;i++){
               if(num % i == 0){
                   System.out.println("NOt prime");
                   break;
               }
           }
           if(num == i){
               System.out.println("It's a prime number");
           }
       }
       }
   }