package n04.es01;

public class Principale {
    public static void main(String args[]){
        Persona persona1 = new Persona("Mario", "Rossi", 25);
        Persona persona2 = new Persona("Luigi", "Neri", 22);
        Persona persona3 = persona1;

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);

    }
}