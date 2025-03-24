import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class example7 {
    public static void main(String[] args)throws IOException {
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        s=br.readLine();
        System.out.println("Name is ="+s);
    }
}
