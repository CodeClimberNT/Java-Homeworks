package n09.es02;

public class Main {
    public static void main(String args[]) {
        Razionale r1 = new Razionale(2, 3);
        Razionale r2 = new Razionale(1, 2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.somma(r2));

        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(1, 2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.somma(c2));
        System.out.println(c1.sottrai(c2));

        Complex c3 = c1.sottrai(c2);
        System.out.println(c3 + "\n------------------------");

        Numero n1, n2, n3;

        n1 = c1;
        n2 = c2;
        n3 = n1.somma(n2);
        System.out.println(n3);
    }
}
