class sample{
    int a,b;
    void getdata()
        {
            a=b=0;
        }
    void getdata(int x)
        {
            a=x;b=x;
        }
    void getdata(int x,int y)
        {
            a=x;
            b=y;
        }
    void display()
        {
            System.out.println("a="+a+", b="+b);
        }
}
public class example3 {
    public static void main(String[] args) {
        sample ob1=new sample();
        sample ob2=new sample();
        sample ob3=new sample();
        ob1.getdata();
        ob2.getdata(9);
        ob3.getdata(10,20);
        ob1.display();
        ob2.display();
        ob3.display();
    }
}
    

    
    