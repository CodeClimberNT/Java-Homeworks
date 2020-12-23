package n01.es05;

public class VerificaPrimi{
    public static void main(String args[]){
        int i, j, flag = 0;                       //dichiarazioni
        int numeri = 100000;

        for(i=1; i<=3; i++){
            System.out.println(i);
        }
        
        for(i=4; i<=numeri; i++){                 //conto da 1 a 100
            for(j=2; j<i; j++){                   //verifico se il numero contato è primo oppure no
                if(i%j == 0){
                    flag++;
                }

            }
            if(flag == 0){                        //output se primo 
                System.out.println(i);          
            }
            flag = 0;
        }
    }
}