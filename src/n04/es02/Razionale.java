package n04.es02;

public class Razionale {
    private int numeratore;
    private int denominatore;

    public Razionale(){
        this.numeratore = 1;
        this.denominatore = 1;
    }
    public Razionale(int numeratore, int denominatore){
        this.numeratore = numeratore;
        if (denominatore == 0) {
            System.out.println("Denominatore nullo, assumo 1...");
            denominatore = 1;
        }
        this.denominatore = denominatore;
        semplifica();
    }

    public String toString(){
        if(this.denominatore == 1){
            return "(" + this.numeratore + ")";
        }
        return "(" + this.numeratore + "/" + this.denominatore + ")";
    }

    public Razionale somma(Razionale altro){
        Razionale risultato = new Razionale(this.numeratore*altro.denominatore + this.denominatore * altro.numeratore, this.denominatore * altro.denominatore);
        risultato.semplifica();
        return risultato;
    }

    public Razionale sottrai(Razionale altro){
        Razionale risultato = new Razionale(this.numeratore*altro.denominatore - this.denominatore * altro.numeratore, this.denominatore * altro.denominatore);
        risultato.semplifica();
        return risultato;
    }

    public Razionale moltiplica(Razionale altro){
        Razionale risultato = new Razionale(this.numeratore * altro.numeratore, this.denominatore * altro.denominatore);
        risultato.semplifica();
        return risultato;
    }

    public Razionale dividi(Razionale altro){
        Razionale risultato = new Razionale(this.numeratore*altro.denominatore, this.denominatore*altro.numeratore);
        risultato.semplifica();
        return risultato;
    }

    private void semplifica(){
        int mcd = 1;
        if(this.numeratore < 0 && this.denominatore < 0) {
            this.numeratore *= -1;
            this.denominatore *= -1;
        }
        for (int i = 1; i <= Math.abs(this.numeratore) && i <= Math.abs(this.denominatore); i++){
            if(this.numeratore % i == 0 && this.denominatore % i == 0){
                mcd = i;
            }
        }
        this.numeratore /= mcd;
        this.denominatore /= mcd;
    }

}
