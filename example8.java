import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class example8 {public static void main(String[] args)throws IOException {
    int a,b,c;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a Number:");
    a=Integer.parseInt(br.readLine());
    System.out.println("Enter 2nd number");
    b=Integer.parseInt(br.readLine());
    c=a+b;
    System.out.println(c);
}
    
}
