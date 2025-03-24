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
public class example2 {
    public static void main(String[] args) {
        sample ob=new sample();
        ob.getdata();
        ob.display();
        ob.getdata(9);
        ob.display();
        ob.getdata(10,20);
        ob.display();
    }
}
