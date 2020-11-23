package n04.es03;

import java.util.Scanner;

public class TestPunto {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci le coordinate del primo punto: ");
        Punto p1 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        System.out.print("Inserisci le coordinate del secondo punto: ");
        Punto p2 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        
        scanner.close();
        System.out.print("p1: " + p1.toString());
        System.out.println();
        System.out.print("p2: " + p2.toString());
        System.out.println();

        System.out.println("Distanza: " + p1.distanza(p2));
        System.out.println("Punto medio p1-p2: " + p1.medio(p2).toString());
        if(p1.equals(p2)){
            System.out.println("Uguali");
        }else{
            System.out.println("Diversi");
        }

    }
}
