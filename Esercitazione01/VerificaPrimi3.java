import java.lang.Math;

public class VerificaPrimi3 {
    public static void main(String args[]){
        int i, j, flag = 0;                              //dichiarazioni
        int numeri=100000;
        int radicale;

        for(i=1; i<=3; i++){
            System.out.println(i);
        }
        for(i=4; i<=numeri; i++){                       //conto da 1 a 100
            radicale = (int) java.lang.Math.sqrt(i);    //uso il metodo della radice per ridurre il calcolo computazionale
            
            for(j=2; j<radicale; j++){                  //verifico se il numero contato è primo oppure no
                if(radicale%j == 0){
                    flag++;
                }
                if (flag > 0){
                    break;
                }
            }
            if(flag == 0){                              //output se primo 
                System.out.println(i);          
            }
            flag = 0;
        }
    }
}
/* alla fine non è molto differente dalla versione */