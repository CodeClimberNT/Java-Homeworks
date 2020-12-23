package n09.es02;

public class Razionale extends Numero{
    private int num, den;

    public Razionale(int num, int den) {
        if(den == 0) {
            throw new IllegalArgumentException("Denominatore nullo");
        }
        
        this.num = num;
        this.den = den;
    }

    public Razionale() {
        this(0, 1);
    }

    public String toString() {
        return num + "/" + den;
    }

    @Override
    public Numero somma(Numero n){
        return null;
    }

    @Override
    public Numero sottrai(Numero n){
        return null;
    }

    @Override
    public Numero moltiplica(Numero n){
        return null;
    }

    @Override
    public Numero dividi(Numero n){
        return null;
    }
}
