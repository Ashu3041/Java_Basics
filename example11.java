import java.util.*;
public class example11
    {
        public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                Float r,p,a;
                System.out.println("Enter The radius of the Circle:");
                r=sc.nextFloat();
                p=2*3.14f*r;
                a=3.14f*r*r;
                System.out.println("Area="+a);
                System.out.println("perimeter="+p);

            }
    }