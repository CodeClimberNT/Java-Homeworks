public class TestQuadrato {
    public static void main(String args[]){
        Quadrato q1 = new Quadrato(2);
        System.out.println(q1.perimetro());
        System.out.println(q1.area());

        Quadrato q2 = new Quadrato(-5);
        System.out.println(q2.perimetro());
        System.out.println(q2.area());
    }
}
