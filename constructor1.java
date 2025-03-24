class sample {
    int a,b,sum;
    sample()
        {
            a=10;
            b=20;
        }
    void display()
        {
            sum=a+b;
            System.out.println("Sum="+sum);
        }
}
class result
{
    public static void main(String[] args) {
        sample ob=new sample();
        ob.display();
    }
}