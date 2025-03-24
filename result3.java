class question {
    int a,b,s;
    void getdata(int x,int y)
           {
            a=x;
            b=y;
           }
    void display()
           {
            s=a+b;
            System.out.println("sum="+s);
           }
}
public class result3
     {
        public static void main(String args[])
            {
                question ob= new question();
                ob.getdata(10,20);
                ob.display();
            }
     }
