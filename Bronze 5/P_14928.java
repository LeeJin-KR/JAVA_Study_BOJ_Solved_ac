import java.io.*;

public class P_14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        long b = 0;
        for(int i=0;i<a.length();i++){
            b = (b*10+ a.charAt(i) - '0') % 20000303;
        }
        System.out.print(b);
    }
}

