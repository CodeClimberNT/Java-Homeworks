import java.util.ArrayList;

public class Principale {
    public static void main(String args[]){
        ArrayList <Persona> miaLista = new ArrayList<>();
        Persona persona1 = new Persona("Mario", "Rossi", 25);
        Persona persona2 = new Persona("Luigi", "Neri", 22);
        Persona persona3 = persona1;

        miaLista.add(persona1);
        miaLista.add(persona2);
        miaLista.add(persona3);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);

        System.out.println("La dimensione della lista è: " + miaLista.size());
        System.out.println("Il secondo elemento della lista è: " + miaLista.get(1));
        //miaLista.remove(1);
        System.out.println("La dimensione della lista è: " + miaLista.size());
        System.out.println("Il secondo elemento della lista è: " + miaLista.get(1));

        for(Persona test : miaLista){
            System.out.println(test);
        }
        
    }
}