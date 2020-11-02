import java.lang.String;

public class SommaInput{
    public static void main(String args[]){
        int i, somma = 0;                                 //inizializzazione variabili

        for (i=0; i<args.length; i++){                    //prendo una stringa trasformata in int e la aggiungo alla variabile somma
            somma += Integer.parseInt(args[i]);
        }
        System.out.println("La somma e' " + somma);       //print della somma totale
    }
}
