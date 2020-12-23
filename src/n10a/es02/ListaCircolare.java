package n10a.es02;

import java.util.List;
import java.util.LinkedList;


public class ListaCircolare<E> {
    private List<E> dati;
    private int posizione;

    public ListaCircolare(){
        dati = new LinkedList<>();
        posizione = -1; //significa che la lista è vuota
    }

    public void avanti(){
        if(posizione != -1) {
            if(posizione == dati.size()-1){
                posizione = 0;
            } else {
                posizione++;
            }
        }
    }

    public void indietro(){
        if(posizione != -1) {
            if(posizione == 0){
                posizione = dati.size()-1;
            } else {
                posizione--;
            }
        }
    }

    public E leggi(){
        if(posizione != -1) {
            return dati.get(posizione);
        }
        return null;
    }


    public void inserisci(E e){
        if(posizione == -1) {
            dati.add(e);
            posizione = 0;
        } else {
            dati.add(posizione, e);
        }
    }

    public void cancella(){
        if(posizione != -1) {
            if(dati.size() == 1) {
                dati.remove(posizione);
                posizione--;
            }

            dati.remove(posizione);
            posizione = posizione % dati.size();
        }
    }

    // public boolean isEmpty(){
    //     return dati.isEmpty();
    // }

    // public boolean isFull(){
    //     if(this.dati.size() == 100){
    //         return true;
    //     }
    //     return false;
    // }

    // public boolean equals(ArrayList<E> altra){
    //     return this.dati.equals(altra);
    // }
    
}
