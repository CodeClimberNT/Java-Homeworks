package n03.es03;

public class Calcolatrice {

    public int[] generaVettore(int L){
        int vettore[] = new int[L];
        for(int i=0; i<L; i++){
            vettore[i]= (int) Math.random()*100;
        }
        return vettore;
    }

    public int[][] generaMatrice(int R, int C){
        int matrice[][] = new int[R][C];
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                matrice[i][j]= (int) Math.random()*100;
            }
        }
        return matrice;
    }

    public int[] sommaVettori(int[] a, int[] b){
        if(a.length!=b.length){
            System.out.println("Impossibile eseguire la somma di due array con lunghezza differente");
            return null;
        }
        int vettoreSomma[] = new int[a.length];

        for(int i=0; i<a.length; i++){
            vettoreSomma[i]=a[i]+b[i];
        }
        return vettoreSomma;
    }

    public int[][] sommaMatrici(int[][] a, int[][] b){
        if(a.length!=b.length || a[0].length!=b[0].length){
            System.out.println("Impossibile eseguire la somma di due matrici di lunghezza differente");
            return null;
        }
        int matriceSomma[][] = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                matriceSomma[i][j] = a[i][j] + b[i][j];
            }
        }
        return matriceSomma;
    }
}
