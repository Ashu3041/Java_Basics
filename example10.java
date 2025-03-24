import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class example10 {
    public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            Float r,a,p;
            System.out.println("Enter Radius of the circle:");
            r=Float.parseFloat(br.readLine());
            p=2*3.14f*r;
            a=3.14f*r*r;
            System.out.println("The perimeter="+p);
            System.out.println("The area="+a);
            
        }    
}
