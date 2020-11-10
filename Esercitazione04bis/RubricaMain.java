import java.util.ArrayList;
import java.util.Scanner;

public class RubricaMain {
    public static void main(String args[]){
        ArrayList<Persona> rubrica = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int input, eta;
        String nome, cognome;

        stampaMenu();

        while((input = scanner.nextInt()) != 5){

            switch (input){
                
                case 1:
                //inserisci
                System.out.println("Inserisci nome, cognome ed età");
                nome = scanner.next();
                cognome = scanner.next();
                eta = scanner.nextInt();
                rubrica.add(new Persona(nome, cognome, eta));
                break;

                case 2:
                //cerca
                System.out.println("Inserisci nome da cercare");
                nome = scanner.next();
                for(Persona ricerca : rubrica){
                    if(ricerca.getNome().equals(nome)){
                        System.out.println("Trovato " + ricerca);
                    }
                }

                break;

                case 3:
                //stampa
                System.out.println(rubrica);
                break;

                case 4:
                //cancella tutto
                rubrica.clear();
                System.out.println("Lista cancellata...");
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
        System.out.println("5. esci");
        System.out.print("> ");
    }
}
