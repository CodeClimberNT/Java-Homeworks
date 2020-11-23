package n05.es04;

import java.util.Scanner;
import n04bis.es04.Studente;


public class Main {
    public static void main(String args[]){
        StudenteList student = new StudenteList();
        Scanner scanner = new Scanner(System.in);
        Scanner dati = new Scanner(System.in);
        String risposta = "";

        do {
            menu();
            risposta = scanner.next();
            switch (risposta) {
                case "a":
                    System.out.println("Specificare nome, cognome, matricola e data di nascita");
                    student.addArchivio(new Studente(dati.next(), dati.next(), dati.nextLong(), dati.nextInt(), dati.nextInt(), dati.nextInt()));
                    System.out.println("Done!");
                    break;
                case "b":
                    System.out.println("Immettere la matricola da ricercare:");
                    System.out.println(student.ricercaArchivio(dati.nextLong()));
                    System.out.println("Done!");
                    break;
                case "c":
                    System.out.println("Immettere il cognome da ricercare:");
                    System.out.println(student.ricercaCognome(dati.next()));
                    System.out.println("Done!");
                    break;
                case "d":
                    System.out.println("Specificare matricola dello studente da aggiungere all'esame:");
                    student.addEsame(dati.nextLong());
                    System.out.println("Done!");
                    break;
                case "e":
                    System.out.println("Specificare matricola dello studente da rimuovere dall'esame:");
                    student.removeEsame(dati.nextLong());
                    System.out.println("Done!");
                    break;
                case "f":
                    System.out.println("Attendere... sto stampando la lista degli iscritti");
                    student.printEsame();
                    System.out.println("Done!");
                    break;
                case "g":
                    System.out.println("Sto cancellando la lista degli iscritti all'esame");
                    student.deleteEsame();
                    System.out.println("Done!");
                    break;
                default:
                System.out.println("Ritenta..");
                    break;
            }
            
        } while(!risposta.equals("h"));

        scanner.close();
        dati.close();
    }

    public static void menu(){
        System.out.println("-----------------------------");
        System.out.println("Cosa vuoi fare?");
        System.out.println("a. inserire un nuovo studente nella lista archiviocon dati inseriti dall’utente");
        System.out.println("b. cercare uno studente nella lista archivioin base alla matricola");
        System.out.println("c. cercare  uno  studente  nella  lista archivioin  base  al  cognome  (se  ce  ne  è  più  di  uno  bisogna stamparli tutti)");
        System.out.println("d. iscrivere uno studente all’esame (inserirlo quindi nella lista esame) in base alla matricola");
        System.out.println("e. rimuovere uno studente dall’esame in base alla matricola");
        System.out.println("f. stampare l’intera lista degli iscritti agli esami");
        System.out.println("g. cancellare l’intera lista degli iscritti all’esame");
        System.out.println("h. esci");
        System.out.print("> ");
        
    }
}
