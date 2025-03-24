class sample
{
    int a,b,sum;
    void var()
       {
        a=10;
        b=20;
       }
    void display()
       {
        sum=a+b;
        System.out.println("sum="+sum);
       }
}
public class e1 {
    public static void main(String[] args) {
        sample ob=new sample();
        ob.display();
    }
}
