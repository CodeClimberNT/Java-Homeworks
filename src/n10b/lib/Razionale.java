package n10b.lib;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lacascia
 */
public class Razionale {
    private int numeratore, denominatore;
    
    public Razionale(int numeratore, int denominatore){
        this.numeratore = numeratore;
        if(denominatore != 0){
            this.denominatore = denominatore;
        } else {
            this.denominatore = 1;
            System.out.println("Denominatore non può essere nullo");
        }
    }
    
    public Razionale(int numeratore){
        this(numeratore, 1);
    }
    
    public Razionale(){
        this(0);
    }
    
    public String toString(){
        return numeratore + "/" + denominatore;
    }
    
    public Razionale somma(Razionale altro){
        Razionale ris = new Razionale();
        
        ris.denominatore = this.denominatore*altro.denominatore;
        ris.numeratore = this.numeratore*altro.denominatore + 
                altro.numeratore*this.denominatore;
        
        return ris;
    }
    
    public Razionale sottrai(Razionale altro){
        Razionale r = new Razionale(-altro.numeratore, altro.denominatore);
        return this.somma(r);
    }
    
    public Razionale moltiplica(Razionale altro){
        Razionale ris = new Razionale();
        
        ris.denominatore = this.denominatore*altro.denominatore;
        ris.numeratore = this.numeratore*altro.numeratore;
        
        return ris;
    }
    
    public Razionale dividi(Razionale altro){
        Razionale ris = new Razionale();

        if(altro.numeratore == 0){
            System.out.println("Divisione per zero non consentita");
        } else {
            ris.denominatore = this.denominatore*altro.numeratore;
            ris.numeratore = this.numeratore*altro.denominatore;
        }
        
        return ris;
    } 
}