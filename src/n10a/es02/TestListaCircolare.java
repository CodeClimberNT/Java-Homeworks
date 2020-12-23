package n10a.es02;

public class TestListaCircolare {
    public static void main(String args[]){
        ListaCircolare<Double> s = new ListaCircolare<>();

        s.inserisci(4.4);
        s.inserisci(3.3);
        s.inserisci(2.2);
        s.inserisci(1.1);

        s.indietro();
        System.out.println(s.leggi());
        s.indietro();
        System.out.println(s.leggi());
        s.indietro();
        System.out.println(s.leggi());
        s.indietro();
        System.out.println(s.leggi());
        s.indietro();
        System.out.println(s.leggi());
        s.indietro();
        System.out.println(s.leggi());

        System.out.println("-----");

        s.avanti();
        System.out.println(s.leggi());
        s.avanti();
        System.out.println(s.leggi());
        s.avanti();
        System.out.println(s.leggi());
        s.avanti();
        System.out.println(s.leggi());
        s.avanti();
        s.inserisci(5.5);
        System.out.println(s.leggi());

        s.cancella();
        s.cancella();
        s.cancella();
        
    }
}
