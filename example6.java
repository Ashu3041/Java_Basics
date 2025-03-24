import java.io.*;
public class example6 {
    public static void main(String[] args)throws IOException {
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name:");
        s=br.readLine();
        System.out.println("Your Name="+s);
    }
}
