import java.math.BigInteger;
import java.util.Scanner;

public class P_2338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger  a = sc.nextBigInteger(), b = sc.nextBigInteger();
        System.out.println(a.add(b)+"\n"+a.subtract(b)+"\n"+a.multiply(b));
    }
}
