import java.util.*;
class sample
{
    int a,b,sum;
    sample()
        {
            a=0;
            b=0;
        }
    sample(int x)
        {
            a=x;
            b=x;
        }
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
public class constructor3 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        sample ob1=new sample();
        sample ob2=new sample(x);
        sample ob3=new sample(x,y);
        ob1.display();
        ob2.display();
        ob3.display();
    }
}
