public class DateMain {
    public static void main(String args[]){
        Date d1 = new Date(25, 3, 2020);
        Date d2 = new Date(1, 2021);
        Date d3 = new Date(2, "Novembre", 2020);
        Date d4 = new Date("2020-2-26");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

        
        d1.stampa1();
        d1.stampa2();
        d1.stampa3();
        d1.stampa4();
        d4.stampa4();

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
