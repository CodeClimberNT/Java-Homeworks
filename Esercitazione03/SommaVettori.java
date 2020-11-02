public class SommaVettori{
    public static void main(String args[]){
        final int dimension=10;
        int vettore1[] = new int[dimension];
        int vettore2[] = new int[dimension];
        int sommaVettori[] = new int[dimension];
        int i;

        for(i=0; i<dimension; i++){
            vettore1[i] = (int) Math.random()*100;
            vettore2[i] = (int) Math.random()*100;
            sommaVettori[i] = vettore1[i] + vettore2[i];
            System.out.println("La somma dei vettori ad indice "+ i + " è " + sommaVettori[i]);
        }
        
    }
}