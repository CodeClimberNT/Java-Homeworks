public class Quadrato {
    public int lato;

    public Quadrato(){}

    public Quadrato(int x){
        if (x<0){
            x=Math.abs(x);
        }
        lato = x;
    }
    public final int NUMERO_LATI = 3;
    
    public int perimetro(){
        return lato*NUMERO_LATI;
    }
    public int area(){
        return lato*lato;
    }
}
