import java.util.Scanner;
public class ProgrammaInterattivo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String stringa = "";
        String banned[]= {"alfa", "beta", "gamma", "delta", "epsilon", "kappa", "lambda", "sigma", "omega"};
        boolean flag=false;

        System.out.println("Digita qualcosa e batti enter, oppure " + "scrivi \"fine\" per terminare il programma");
        while(!(stringa = scanner.next()).equals("fine")) {

            for(int i=0; i<banned.length; i++){
                if(stringa.equals(banned[i])){
                    System.out.println("Hai detto una parola vietata!");
                    flag=true;
                    break;
                }else flag=false;
                
            }
            if(!flag){
                System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
            }
        }
        System.out.println("Fine programma!");
        scanner.close();
    }
}