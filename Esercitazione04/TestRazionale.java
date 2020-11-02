import java.util.Scanner;

public class TestRazionale {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci r1: ");
        Razionale r1 = new Razionale(scanner.nextInt(), scanner.nextInt());

        System.out.println("Inserisci r2: ");
        Razionale r2 = new Razionale(scanner.nextInt(), scanner.nextInt());
        scanner.close();

        System.out.println("r1: " + r1.toString());
        System.out.println("r2: " + r2.toString());

        System.out.println("r1 + r2: " + r1.somma(r2).toString());
        System.out.println("r1 - r2: " + r1.sottrai(r2).toString());
        System.out.println("r1 * r2: " + r1.moltiplica(r2).toString());
        System.out.println("r1 / r2: " + r1.dividi(r2).toString());

    }
}
