class example {
    String model = "Fortuner";
    int year=1015;
    void display()
    {
        System.out.println("car model="+ model +", car year"+year);
    }
}
public class object1{
    public static void main(String[] args) {
        example ob=new example();
        ob.display();

    }
}