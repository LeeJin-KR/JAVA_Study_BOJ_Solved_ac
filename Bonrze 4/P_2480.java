import java.util.Scanner;

public class P_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a == b || a == c || b == c) {
            System.out.println(a == b && b == c ? 10000 + a * 1000 : a == b || a == c ? 1000 + a * 100 : 1000 + b * 100);
        }else{
            if(a>b && a>c) {
                System.out.println(a * 100);
            }else if(c>a && c>b){
                System.out.println(c * 100);
            }else{
                System.out.println(b * 100);
            }
        }
    }
}