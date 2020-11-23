package n02.es05;

public class Rettangolo {
    int base, altezza;
    public Rettangolo(){}
    public Rettangolo(int b, int h){
        if(b<0){
            Math.abs(b);
        }
        if(h<0){
            Math.abs(h);
        }

        base = b;
        altezza = h;
    }
    
    public int perimetro(){
        return base*2 + altezza*2;
    }
    public int area(){
        return base*altezza;
    }
}
