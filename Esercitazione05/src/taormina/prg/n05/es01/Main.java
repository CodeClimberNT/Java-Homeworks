package src.taormina.prg.n05.es01;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aggiungi c1:");
        Complex c1 = new Complex(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Aggiungi c2:");
        Complex c2 = new Complex(scanner.nextDouble(), scanner.nextDouble());
        
        if(c1.equals(c2)){
            System.out.println("c1 e c2 sono uguali");
        }else{
            System.out.println("c1 e c2 non sono uguali");
        }
        System.out.println("c1 + c2: " + c1.somma(c2));
        System.out.println("c1 - c2: " + c1.sottrai(c2));
        System.out.println("c1 * c2: " + c1.moltiplica(c2));
        System.out.println("c1 / c2: " + c1.dividi(c2));
        System.out.println("Distanza tra c1 e c2: " + c1.distanza(c2));



        scanner.close();
    }
}
