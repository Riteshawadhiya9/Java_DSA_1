package JavaOperators_Lec_5;

public class BitwiseOperator {
    public static void main(String[] args) {
        int p = 9 , q = 10 ;

        System.out.println(p | q);//11
        System.out.println(p & q);//8
        System.out.println(p ^ q);//3


        System.out.println( p << 1);//18
        System.out.println(p << 2);//36


        System.out.println( q >> 1);//5
        System.out.println(q >> 2);//2

    }
    
    
}
