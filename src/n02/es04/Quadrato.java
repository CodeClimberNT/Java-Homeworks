package n02.es04;

public class Quadrato {
    public int lato;
    public final int NUMERO_LATI = 4;

    public Quadrato(){

    }

    public Quadrato(int x){
        if (x<0){
            x=Math.abs(x);
        }
        lato = x;
    }

    
    public int perimetro(){
        return lato*NUMERO_LATI;
    }
    
    public int area(){
        return lato*lato;
    }
}
