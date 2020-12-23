package n10a.es03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lacascia
 */
public class Date implements Comparable<Date>{
    private int data; // memorizzo la data come i giorni trascorsi dalla nascita
                        // di Cristo. Per semplicità non considero i bisestili e
                        // considero solo date d.C.
    
    private final String[] nomiMesi = {"gennaio", "febbraio", "marzo", "aprile", "maggio", 
            "giugno", "luglio", "agosto", "settembre", "ottobre", "novembre", "dicembre"};    
    private final int[] giorniMesi = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int giorniAnno = 365;
    

    public int compareTo(Date d) {
        return this.data > d.data ? 1 : this.data == d.data ? 0 : -1;
    }

    // Metodi set con differenti formati dei parametri
    public void set(int ggg, int aaaa){
        if(ggg >= 1 && ggg <= 365 && aaaa >= 0){
            data = aaaa * giorniAnno + ggg;
        } else {
            System.out.println("Data non valida!");
            data = 1;
        }
    }
    
    public void set(int gg, int mm, int aaaa){
        if(aaaa >= 0 && mm >= 1 && mm <=12 && gg >= 1 && gg <= giorniMesi[mm - 1]){
            data = aaaa * 365; // giorni degli anni
            for(int i=0; i<mm-1; ++i) // aggiungo i giorni dei mesi fino al mese precedente
                data += giorniMesi[i];
            data += gg; // aggiungo i giorni
        } else {
            System.out.println("Data non valida!");
            data = 1;
        }
    }
    
    public void set(int gg, String mese, int aaaa){
        int mm = 0;
        for(int i=0; i<12; ++i){
            if(mese.equals(nomiMesi[i])) mm = i+1;
        }
        if(mm != 0){
            set(gg, mm, aaaa);
        } else {
            System.out.println("Mese non valido!");
            data = 1;
        }
    }
    
    // Metodi get per leggere valori numerici di gg, mm e aaaa
    public int getAnno(){
        return data/giorniAnno;
    }
    
    public int getMese(){
        int ggg = data%giorniAnno;
        // Trova in che mese cade il giorno dell'anno
        for(int i=0; i<12; ++i){
            if(ggg<=giorniMesi[i])
                return i+1;
            else
                ggg -= giorniMesi[i];
        }
        return 0; // in realtà se ggg è fra 1 e 365 qui non si dovrebbe arrivare mai
    }
    
    public int getGiorno(){
        int ggg = data%giorniAnno;
        // Converte da giorno dell'anno a giorno del mese
        for(int i=0; i<12; ++i){
            if(ggg<=giorniMesi[i])
                return ggg;
            else
                ggg -= giorniMesi[i];
        }
        return 0; // in realtà se ggg è fra 1 e 365 qui non si dovrebbe arrivare mai
    }
    
    
    // Costruttori
    public Date(int ggg, int aaaa){
        set(ggg, aaaa);
    }
    
    public Date(int gg, int mm, int aaaa){
        set(gg, mm, aaaa);
    }
    
    public Date(int gg, String mese, int aaaa){
        set(gg, mese, aaaa);
    }
    
    // Funzioni di stampa
    public void stampa1(){
        System.out.println(data%giorniAnno + "/" + data/giorniAnno);
    }
    
    public void stampa2(){
        System.out.println(getGiorno() + "/" + getMese() + "/" + getAnno());
    }
    
    public void stampa3(){
        System.out.println(getGiorno() + " " + nomiMesi[getMese()-1] + " " + getAnno());
    }
    
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Date)) return false;
        Date d = (Date)obj;
        if(d.data == this.data)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode(){
        return this.data;
    }

    // Funzioni di utilità
    public boolean equals(Date altro){
        return (this.data == altro.data);
    }
    
    public String toString(){
        return getGiorno() + "/" + getMese() + "/" + getAnno();
    }
}
