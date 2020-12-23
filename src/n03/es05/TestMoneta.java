package n03.es05;

public class TestMoneta {
    public static void main(String args[]){
        Moneta moneta = new Moneta();
        int lanciMoneta = 100000;
        int numCroce=0;
        double percentuale;
        for (int i=0; i<lanciMoneta; i++){
            if(moneta.lancia()==1){
                numCroce++;
            }
        }

        percentuale = (numCroce * 100 / lanciMoneta);
        System.out.println(Math.round(percentuale) +"%");
      
    }
}
