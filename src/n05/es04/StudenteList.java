package n05.es04;

import java.util.ArrayList;
import n04bis.es04.Studente;

public class StudenteList {
    private ArrayList<Studente> archivio =  new ArrayList<>();
    private ArrayList<Studente> esame =  new ArrayList<>();

    public void addArchivio(Studente utente){
        archivio.add(utente);
    }

    public Studente ricercaArchivio(long matricola){
        Studente trovato;
        for(Studente temp : archivio){
            if (temp.getMatricola() - matricola < 0.1e-15){
                trovato = temp;
                return trovato;
            }
        }
        return null;
    }

    public ArrayList<Studente> ricercaCognome(String cognome){
        boolean flag = false;
        ArrayList<Studente> trovati = new ArrayList<>();
        for (Studente temp : archivio) {
            if(temp.getCognome().equals(cognome)) {
                trovati.add(temp);
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("Impossibile trovare cognome specificato");
            return null;
        }
        return trovati;
    }

    public void addEsame(long matricola){
        for(Studente temp : archivio){
            if(temp.getMatricola() - matricola < 0.1e-15){
                esame.add(temp);
                return;
            }
        }
        System.out.println("Impossibile trovare matricola specificata");
    }

    public void removeEsame(long matricola){
        for(Studente temp : esame) {
            if(temp.getMatricola() - matricola < 0.1e-15){
                esame.remove(temp);
                return;
            }
        }
        System.out.println("Impossibile trovare matricola specificata");
    }

    public void printEsame(){
        if(esame.isEmpty()){
            System.out.println("Non ci sono studenti iscritti all'esame");
        } else {
            for (Studente temp : esame) {
                System.out.println(temp);
            }  
        }
    }

    public void deleteEsame(){
        esame.clear();
    }
}
