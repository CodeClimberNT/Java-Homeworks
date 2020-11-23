package n05.es01;

import java.text.DecimalFormat;

public class Complex {
    DecimalFormat df = new DecimalFormat("#.####");
    private double reale;
    private double immaginario;

    public Complex(double re, double im){
        this.reale = re;
        this.immaginario = im;
    }

    public Complex(double re){
        this(re, 0);
    }

    public Complex(){
        this(0, 0);
    }

    public Complex somma(Complex altro){
        return new Complex(this.reale + altro.reale, this.immaginario + altro.immaginario); 
    }
    
    public Complex sottrai(Complex altro){
        return new Complex(this.reale - altro.reale, this.immaginario - altro.immaginario); 
    }

    public Complex moltiplica(Complex altro){
        return new Complex((this.reale * altro.reale) - (this.immaginario * altro.immaginario), (this.reale * altro.immaginario) + (this.immaginario * altro.reale));
    }

    public Complex dividi(Complex altro){
        double denominatore = (altro.reale * altro.reale) + (altro.immaginario * altro.immaginario);
        if(denominatore == 0){
            return null;
        }
        double frazioneReale =          ( (this.reale * altro.reale) + (this.immaginario * altro.immaginario) ) / denominatore;
        double frazioneImmaginario =    ( (this.immaginario * altro.reale) - (this.reale * altro.immaginario) ) / denominatore;

        return new Complex(frazioneReale, frazioneImmaginario);
    }

    public double distanza(Complex altro){
        return Math.sqrt(((this.reale - altro.reale) * (this.reale - altro.reale)) + (this.immaginario - altro.immaginario) * (this.immaginario - altro.immaginario));
    }

    public String toString(){
        return df.format(this.reale) + " i" + df.format(this.immaginario);
    }

    public boolean equals(Complex altro){
        if(((this.reale - altro.reale) < 0.01) && ((altro.reale - altro.immaginario) < 0.1e-15)){
            return true;
        }
        return false;
    }

}