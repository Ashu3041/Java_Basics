import java.util.*;
public class array1 
{
    public static void main(String[] args) {
        int size,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        size=sc.nextInt();
        int a[]=new int[size];
        for (n=0;n<size-2;n++)
            {
                System.out.println("Enter elements");
                a[n]=sc.nextInt();
            }
        for (n=0;n<size-2;n++)
            {
                System.out.println(a[n]);
            }
    }
}
