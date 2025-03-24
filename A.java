class sample
{
     int a,b,s;
    void getdata()
        {
            a=10;
            b=20;
        }
    void sum()
        {
            s=a+b;
        }
    void display()
        {
            System.out.println(s);
        }
}
public class A 
{
    public static void main(String args[])
    {
        int p=100;
        sample ob=new sample();
        ob.getdata();;
        ob.sum();
        ob.display();
        System.out.println(p);
    }
}