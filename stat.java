public class stat {
 static int x=10;
    public static void main(String[] args) {
        stat obj1=new stat();
        
        stat obj2=new stat();
        stat obj3=new stat();
        stat obj4=new stat();
        System.out.println(obj1.x);
        obj1.x=30;
        obj3.x=40;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
        System.out.println(obj3.x);
        System.out.println(obj4.x);

    }
}