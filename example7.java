import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class example7 {
    public static void main(String[] args)throws IOException {
        int s,y,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a  number:");
        s=Integer.parseInt(br.readLine());
        System.out.println("Enter a  number:");
        y=Integer.parseInt(br.readLine());
        c=s+y;
        System.out.println("sum is ="+c);
    }
}
