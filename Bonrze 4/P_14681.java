import java.util.Scanner;

public class P_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a*b<0){
            System.out.println(a<0 ? "2" : "4");
        }else{
            System.out.println(a<0 ? "3" : "1");
        }
    }
}
