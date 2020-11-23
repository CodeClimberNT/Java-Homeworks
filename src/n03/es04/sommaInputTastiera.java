package n03.es04;

import java.util.Scanner;

public class sommaInputTastiera {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi il primo numero");
        int primoNumero = scanner.nextInt();
        System.out.println("Scrivi il secondo numero");
        int secondoNumero = scanner.nextInt();
        scanner.close();
        int somma = primoNumero + secondoNumero;
        int prodotto = primoNumero * secondoNumero;
        System.out.println("La somma dei numeri è " + somma);
        System.out.println("Il prodotto dei numeri è " + prodotto);
    }
}
