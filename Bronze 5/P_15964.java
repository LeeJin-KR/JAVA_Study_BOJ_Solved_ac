import java.math.BigInteger;
import java.util.Scanner;

public class P_15964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger(), B = sc.nextBigInteger();
        System.out.println( ((A.add(B)).multiply(A.subtract(B))) );
    }
}
