package n03.es03;

public class TestMatematica {
    public static void main(String args[]){
        Calcolatrice miaCalcolatrice = new Calcolatrice();
        int vettore1[] = miaCalcolatrice.generaVettore(3);
        int vettore2[] = miaCalcolatrice.generaVettore(3);
        int vettore3[] = miaCalcolatrice.generaVettore(5);
        int vettore12[] = miaCalcolatrice.sommaVettori(vettore1, vettore2);
        int vettore13[] = miaCalcolatrice.sommaVettori(vettore1, vettore3);
        
        for(int i=0; i<3; i++){
            System.out.print(vettore12[i] + " ");
        }
        System.out.println();
        System.out.println(vettore13);
        
    }
}
