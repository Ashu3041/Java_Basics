import java.io.*;
public class average {
    public static void main(String args[]) throws IOException
        {
            Double avg,a,b,c;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the value of a:");
            a=Double.parseDouble(br.readLine());
            System.out.println("Enter the value of b:");
            b=Double.parseDouble(br.readLine());
            System.out.println("Enter the value of c:");
            c=Double.parseDouble(br.readLine());
            avg=(a+b+c)/3;
            System.out.println("The average of the numbers="+avg);
        }
}
