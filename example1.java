class sample{
    int a,b,s;
    void getdata(int x,int y)
        {
            a=x;
            b=y;
        }
    void display()
        {
            s=a+b;
            System.out.println(s);
        }
}
public class example1{
    public static void main(String[] args) {
        sample obj=new sample();
        obj.getdata(10,15);
        obj.display();
    }
}