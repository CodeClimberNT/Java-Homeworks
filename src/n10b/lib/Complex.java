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
public class Complex {
    private double re, im;
    
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    
    public Complex(double re) {
        this(re, 0.0);    
    }
    
    public Complex() {
        this(0.0);
    }
    
    public Complex somma(Complex altro) {
        return (new Complex(this.re + altro.re, this.im + altro.im));
    }
    public Complex sottrai(Complex altro) {
        return (new Complex(this.re - altro.re, this.im - altro.im));
    }
    
    public double distanza(Complex altro) {
        return Math.sqrt((this.re-altro.re)*(this.re-altro.re) + 
                    (this.im-altro.im)*(this.im-altro.im));
    }
    public String toString() {
        return re + (im>0.0 ? "+" : "") + im + " i";
    }
    
}
