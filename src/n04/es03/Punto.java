package n04.es03;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + " "+ y + ")";
    }

    public double distanza(Punto altro){
        return Math.sqrt((this.x-altro.x)*(this.x-altro.x)+
                         (this.y-altro.y)*(this.y-altro.y));
    }

    public Punto medio(Punto altro){
        Punto medio = new Punto((this.x+altro.x)/2, (this.y+altro.y)/2);
        return medio;
    }
    
    public boolean equals(Punto altro){
        if(this.x-altro.x<0.01){
            if(this.y-altro.y<0.01){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
