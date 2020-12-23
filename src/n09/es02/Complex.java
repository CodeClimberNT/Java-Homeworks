package n09.es02;

public class Complex extends Numero {
    private double reale, immaginario;

    public Complex(double re, double im) {
        this.reale = re;
        this.immaginario = im;
    }

    public Complex() {
        this(0.0, 0.0);
    }

    public String toString() {
        return "(" + reale + ", " + immaginario + ")";
    }

    @Override
    public Complex somma(Numero altro){
        Complex c;
        if(altro instanceof Complex){
            c = (Complex)altro;
        } else {
            throw new IllegalArgumentException("Operando deve essere Complex");
        }

        return new Complex(this.reale + c.reale, this.immaginario + c.immaginario); 
    }
    
    @Override
    public Complex sottrai(Numero altro){
        Complex c;
        if(altro instanceof Complex){
            c = (Complex)altro;
        } else {
            throw new IllegalArgumentException("Operando deve essere Complex");
        }
        return new Complex(this.reale - c.reale, this.immaginario - c.immaginario); 
    }

    @Override
    public Complex moltiplica(Numero altro){
        Complex c;
        if(altro instanceof Complex){
            c = (Complex)altro;
        } else {
            throw new IllegalArgumentException("Operando deve essere Complex");
        }

        return new Complex((this.reale * c.reale) - (this.immaginario * c.immaginario), (this.reale * c.immaginario) + (this.immaginario * c.reale));
    }

    @Override
    public Complex dividi(Numero altro){
        Complex c;
        if(altro instanceof Complex){
            c = (Complex)altro;
        } else {
            throw new IllegalArgumentException("Operando deve essere Complex");
        }

        double denominatore = (c.reale * c.reale) + (c.immaginario * c.immaginario);
        if(denominatore == 0) {
            throw new IllegalArgumentException("Denominatore nullo");
        }
        double frazioneReale =          ( (this.reale * c.reale) + (this.immaginario * c.immaginario) ) / denominatore;
        double frazioneImmaginario =    ( (this.immaginario * c.reale) - (this.reale * c.immaginario) ) / denominatore;

        return new Complex(frazioneReale, frazioneImmaginario);
    }
    
}
