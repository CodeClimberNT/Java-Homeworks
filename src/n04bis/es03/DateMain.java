package n04bis.es03;

public class DateMain {
    public static void main(String args[]){
        Date d1 = new Date(29, 2, 2021);
        Date d2 = new Date(170, 2020);
        Date d3 = new Date(29, "febbraio", 2020);
        Date d4 = new Date("2020-2-29");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

        
        d3.stampa1();
        d3.stampa2();
        d3.stampa3();
        d3.stampa4();

        
        if(d1.equals(d2)){
            System.out.println("d1 e d2 uguali");
        }

        if(d1.equals(d3)){
            System.out.println("d1 e d3 uguali");
        }
        if(d1.equals(d4)){
            System.out.println("d1 e d4 uguali");
        }
    }
}
