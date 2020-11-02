import java.util.ArrayList;

public class Rubrica {
    ArrayList<Persona> database;

    public Rubrica(){
        database = new ArrayList<>();
    }

    public void add(String nome, String cognome, int eta){
        Persona contatto = new Persona(nome, cognome, eta);
        database.add(contatto);
    }

    public void findName(String name){
        for(Persona ricerca : database){
            if(ricerca.getNome().equals(name)){
                System.out.println("Trovato " + ricerca);
            }
        }
    }

    public void stamp(){
        System.out.println(database);
    }

    public void clear(){
        database.clear();
        System.out.println("Lista eliminata...");
    }


}
