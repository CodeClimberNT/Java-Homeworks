package n04bis.es01;

import java.util.Scanner;

public class RubricaMain2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int input;
        Rubrica lavoro = new Rubrica();
        Rubrica amici = new Rubrica();
        Rubrica corrente = lavoro;

        stampaMenu();
        while((input = scanner.nextInt()) != 6){

            switch (input){
                
                case 1:
                //inserisci
                System.out.println("Inserisci nome, cognome ed età");
                corrente.add(scanner.next(), scanner.next(), scanner.nextInt());
                break;

                case 2:
                //cerca
                System.out.println("Inserisci nome da cercare");
                corrente.findName(scanner.next());
                break;

                case 3:
                //stampa
                corrente.stamp();
                break;

                case 4:
                //cancella tutto
                corrente.clear();
                break;

                case 5:
                // cambia rubrica
                if(corrente == amici){
                    corrente = lavoro;
                    System.out.println("Ora in rubrica lavoro");
                } else {
                    corrente = amici;
                    System.out.println("Ora in rubrica amici");
                }
                break;

                default:
                System.out.println("SCELTA NON VALIDA!");
            }

            stampaMenu();


        }
        scanner.close();
    }

    public static void stampaMenu(){
        System.out.println("------------------");
        System.out.println("1. Inserisci nuovo");
        System.out.println("2. cerca");
        System.out.println("3. stampa tutto");
        System.out.println("4. cancella tutto");
        System.out.println("5. cambia rubrica");
        System.out.println("6. esci");
        System.out.print("> ");
    }
}
