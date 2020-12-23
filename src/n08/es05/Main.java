package n08.es05;

public class Main {
    public static void main(String args[]) throws MyStackOverflow {
        Stack s1 = new Stack();

        for(int i = 0; i < 105; i++) {
            try{
                s1.push("n " + i);
            } catch(MyStackOverflow exc) {
                System.out.println(exc.getMessage());
                System.out.println("Rimuovo l'ultimo e inserisco" + exc.getData());

            }
        }

    }
}
