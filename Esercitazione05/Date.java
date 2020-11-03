public class Date {
    private int day, year;
    private int daysInMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    boolean bisestile;

    



    /*<---------------------------------COSTRUTTORI---------------------------------> */

        /* input GGG AAAA */
    public Date(int g, int a) {                                                                     
        if (a < 0) {
            System.out.println("Non posso calcolare anni prima di Cristo");
            return;
        }

        this.year = a;
        this.day = g;
        setBisestile(a);
    }

        /* input GG/MM/AA */
    public Date(int g, int m, int a) {                                                                  
        if (a < 0) {
            System.out.println("Non posso calcolare anni prima di Cristo");
            return;
        }
        
        this.year = a;
        this.day = daysAndMonthToDays(g, m);
        setBisestile(a);
        if  (( g > 29 && m == 2 && bisestile) ||
             ( g > 28 && m == 2 && !bisestile)) {
            System.out.println("Errore inserimento dati");
            return;
        }
    }

        /* input GG month AAAA (Ex. 14 Giugno 1992) */
    public Date(int g, String m, int a) {                                                           
        if (a < 0) {
            System.out.println("Non posso calcolare anni prima di Cristo");
            return;
        }
        int month = stringMonthToInt(m);
        
        this.year = a;
        this.day = daysAndMonthToDays(g, month);
        setBisestile(a);
        if  (( g > 29 && month == 2 && bisestile) ||
             ( g > 28 && month == 2 && !bisestile)) {
            System.out.println("Errore inserimento dati");
            return;
        }
    }

        /* input stile GMT YYYY-MM-DD */
    public Date(String gmt) {
        String dateArray[] = gmt.split("-");
        int year = Integer.valueOf(dateArray[0]);
        if (year < 0) {
            System.out.println("Non posso calcolare anni prima di Cristo");
            return;
        }

        int m = Integer.valueOf(dateArray[1]);
        int g = Integer.valueOf(dateArray[2]);
        
        this.year = year;
        this.day = daysAndMonthToDays(g, m);
        setBisestile(Integer.valueOf(dateArray[0]));
        if  (( g > 29 && m == 2 && bisestile) ||
             ( g > 28 && m == 2 && !bisestile)) {
            System.out.println("Errore inserimento dati");
            return;
        }
    }





    /* <---------------------------------METODI PUBBLICI---------------------------------> */
        /* Ritorna stringa stile "DD month YYYY" */
    public String toString() {
        return daysToDaysAndMonth(this.day)[0] + " " + intMonthToString(daysToDaysAndMonth(this.day)[1]) + " " + this.year;
    }
        /* Confronto tra due Date */
    public boolean equals(Date altro) {
        if (this.day == altro.day && this.year == altro.year) {
            return true;
        }
        return false;
    }

        /* stampa stile DDD YYYY */
    public void stampa1() {                                                                 
        System.out.println(this.day + " " + this.year);
    }

        /* stampa stile DD/MM/YY */
    public void stampa2() {                                                                 
        int shortDays = daysToDaysAndMonth(this.day)[0];
        int month = daysToDaysAndMonth(this.day)[1]; 

        System.out.println(shortDays + "/" + String.format("%02d", month) + "/" + Math.abs(this.year % 100));
    }

        /* stampa stile DD month YYYY */
    public void stampa3() {                                                                     
        int shortDays = daysToDaysAndMonth(this.day)[0];
        String month = intMonthToString(daysToDaysAndMonth(this.day)[1]);

        System.out.println(shortDays + " " + month + " " + this.year);
    }

        /* stampa stile GMT YYYY-MM-DD */
    public void stampa4() {                                                                      
        int shortDays = daysToDaysAndMonth(this.day)[0];
        int month = daysToDaysAndMonth(this.day)[1];                                                                   

        System.out.println(this.year + "-" + String.format("%02d", month) + "-" + String.format("%02d", shortDays));
    }





    /* <---------------------------------METODI PRIVATI---------------------------------> */
    
        /* CONVERT DDDD FORMAT TO DD/MM FORMAT */
    private int[] daysToDaysAndMonth(int day){
        int dm[] = new int [2];
        int month;

        for (month = 0; month < daysInMonth.length; month++) {
            if (day > daysInMonth[month]) {
                day -= daysInMonth[month];
            } else {
                break;
            }
        }

        dm[0] = day;
        dm[1] = (month+1);
        return dm;
    }

        /* CONVERT DD/MM FORMAT TO DDDD FORMAT */
    private int daysAndMonthToDays(int day, int month){
        for (int i = 0; i < month - 1; i++) {
            day += this.daysInMonth[i];
        }
        return day;
    }

        /* IMPOSTA MESE BISESTILE DAL VALORE DELL'ANNO */
    private void setBisestile(int a){
        if (a % 400 == 0) {                                                                
            this.daysInMonth[1] = 29;
            this.bisestile = true;
            if (this.day > 366) {
                System.out.println("Errore inserimento dati");
                return;
            }
            return;
        } else if (a % 4 == 0 && !(a % 100 == 0)) {
            this.daysInMonth[1] = 29;
            this.bisestile = true;
            if (this.day > 366) {
                System.out.println("Errore inserimento dati");
                return;
            }
            return;
        }
        this.bisestile = false;
        if (this.day > 365) {
            System.out.println("Errore inserimento dati");
            return;
        }
    }

        /* CONVERT STRING MONTH TO INTEGER MONTH */
    private int stringMonthToInt(String m){
        int month;
        switch (m.toLowerCase().trim()) {
            case "gennaio":
                month = 1;
                break;

            case "febbraio":
                month = 2;
                break;

            case "marzo":
                month = 3;
                break;

            case "aprile":
                month = 4;
                break;

            case "maggio":
                month = 5;
                break;

            case "giugno":
                month = 6;
                break;

            case "luglio":
                month = 7;
                break;

            case "agosto":
                month = 8;
                break;

            case "settembre":
                month = 9;
                break;

            case "ottobre":
                month = 10;
                break;

            case "novembre":
                month = 11;
                break;

            case "dicembre":
                month = 12;
                break;

            default:
                System.out.println("Errore nome mese");
                return 0;
        }
        return month;
    }

        /* CONVERT INTEGER MONTH TO STRING MONTH */
    private String intMonthToString(int m){
        String month;
        switch (m) {
            case 1:
                month = "Gennaio";
                break;

            case 2:
                month = "Febbraio";
                break;

            case 3:
                month = "Marzo";
                break;

            case 4:
                month = "Aprile";
                break;

            case 5:
                month = "Maggio";
                break;

            case 6:
                month = "Giugno";
                break;

            case 7:
                month = "Luglio";
                break;

            case 8:
                month = "Agosto";
                break;

            case 9:
                month = "Settembre";
                break;

            case 10:
                month = "Ottobre";
                break;

            case 11:
                month = "Novembre";
                break;

            case 12:
                month = "Dicembre";
                break;

            default:
                System.out.println("Errore logico grave");
                return "";
        }
        return month;
    }
}
