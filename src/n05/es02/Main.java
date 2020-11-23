package n05.es02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Scanner frase = new Scanner(System.in);
        Stack stack = new Stack();
        int risposta;

        ArrayList<String> altra = new ArrayList<>();
        altra.add("prova");
        altra.add("prova2");

        do{
            menu();
            risposta = scanner.nextInt();
            switch (risposta) {
                case 1:
                    System.out.println("Specifica la stringa da inserire");
                    stack.push(frase.nextLine());
                    break;
                case 2:
                    System.out.println(stack.pop());
                    break;
                case 3:
                    if(stack.isEmpty()) {
                        System.out.println("Si, la lista è vuota");
                    } else {
                        System.out.println("No, la lista non è vuota");
                    }
                    break;
                case 4:
                    if(stack.isFull()) {
                        System.out.println("Si, la lista è piena");
                    } else {
                        System.out.println("No, la lista non è piena");
                    }
                    break;
                case 5:
                    System.out.println(stack);
                    break;
                case 6:
                    if(stack.equals(altra)) {
                        System.out.println("Si, sono uguali");
                    } else {
                        System.out.println("No, non sono uguali");
                    }break;
                default:
                    break;
            }

        }while(risposta < 7);
        frase.close();
        scanner.close();
    }


    static void menu(){
        System.out.println("---------------");
        System.out.println("Cosa vuoi fare?");
        System.out.println("1. Aggiungere una Stringa");
        System.out.println("2. Estrarre ultima Stringa");
        System.out.println("3. Lista Vuota?");
        System.out.println("4. Lista Piena?");
        System.out.println("5. Stampa tutta la lista");
        System.out.println("6. Uguaglianza tra due liste");
        System.out.println("7. Exit");
        System.out.print("> ");
    }
}
