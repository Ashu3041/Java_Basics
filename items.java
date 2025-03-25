import java.util.*;
public class items {
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    Float pen,pencil,eraser,Bill;
    System.out.println("Enter the rate of the pencil");
    pencil=sc.nextFloat();
    System.out.println("Enter the rate of the pen");
    pen=sc.nextFloat();
    System.out.println("Enter the rate of the eraser");
    eraser=sc.nextFloat();
    Bill=(pen+pencil+eraser)*1.18f;
    System.out.println("Your Bill="+Bill);
    }

}
