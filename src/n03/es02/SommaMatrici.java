package n03.es02;

public class SommaMatrici {
    public static void main(String args[]){
        final int h=3, b=5;
        int matrice1[][] = new int[h][b];
        int matrice2[][] = new int[h][b];
        int sommaMatrici[][] = new int[h][b];
        
        for (int i=0; i<h; i++){
            for (int j=0; j<b; j++){
                matrice1[i][j] = (int) Math.random()*100;
                matrice1[i][j] = (int) Math.random()*100;
                sommaMatrici[i][j] = matrice1[i][j] + matrice2[i][j];
                System.out.print(sommaMatrici[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        
    }
}
