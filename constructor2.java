import java.io.*;
class sample{
    int a,b,sum;
    sample(int x,int y)
        {
            a=x;
            b=y;
        }
    void display()
        {
            sum=a+b;
            System.out.println("sum="+sum);
        }
}
public class constructor2 {
    public static void main(String[] args) throws IOException
    {
        int x,y;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The value of x abd y");
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());
        sample ob=new sample(x , y);
        ob.display();
    }
}
