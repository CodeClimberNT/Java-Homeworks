package n01.es04;
 
public class ContaParola {
    public static void main(String args[]){
        int numCiao = 0;
        for (int i = 0; i<args.length; i++){
            if(args[i].equals("Ciao"))
            numCiao++;
        }
        System.out.println("Hai inserito " + numCiao + " argomenti uguali alla parola Ciao");
    }

}
