class sample {
    int a,b,c;
    void biggest(int x,int y,int z)
        {
            a=x;b=y;c=z;
            if (a>b)
                {
                    if (c>a) 
                      System.out.println("Biggest="+c);
                    else
                        System.out.println("Biggest="+a);
                }
            else
                {
                    if(c>b) 
                        System.out.println("Biggest="+c);
                    else
                        System.out.println("Biggest="+b);
                }
        }
}
public class example4 {public static void main(String[] args) {
    sample ob=new sample();
    ob.biggest(100, 20000, 600);
}
    
}
