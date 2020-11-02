public class Contatore {
    public static void main(String[] args){
        System.out.println("Hai inserito " + args.length + " argomenti");
        for(int i = args.length-1; i>=0; i--){
            System.out.println(args[i]);
        }
        for(int i = 0; i < args.length-1; i++){
            if(i%2 != 0){
                System.out.println(args[i]);
            }
        }
        System.out.println(args[-1]);
    }
}
