import java.util.Scanner;

public class P_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        System.out.println(a*Integer.parseInt(String.valueOf(b.charAt(2))));
        System.out.println(a*Integer.parseInt(String.valueOf(b.charAt(1))));
        System.out.println(a*Integer.parseInt(String.valueOf(b.charAt(0))));
        System.out.println(a*Integer.parseInt(b));
    }
}
