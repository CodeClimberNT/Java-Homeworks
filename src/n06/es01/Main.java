package n06.es01;

public class Main {
    public static void main(String args[]) {
        Circle c1 = new Circle("red", true, 2.5);
        Circle c2 = new Circle();
    
        System.out.println(c1);
        System.out.println(c2);
    
        c2.setRadius(10);
        c2.setColor("green");
        System.out.println(c2);
        System.out.println("Area c2: " + c2.area());

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.0 , 3.0);

        System.out.println(r1);
        System.out.println(r2);
        
        r1.setWidth(5.0);
        System.out.println(r1.perimeter());
        System.out.println(r2.area());
        
        
        System.out.println("-------------------------------");

        Square s1 = new Square();
        Square s2 = new Square(2.5);
        Square s3 = new Square("blue", false, 1.5);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        s1.setWidth(5.0);
        System.out.println(s1);
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
        
        s2.setWidth(3.0);
        System.out.println(s2);
        System.out.println(s2.perimeter());
        System.out.println(s2.area());

    }
}
