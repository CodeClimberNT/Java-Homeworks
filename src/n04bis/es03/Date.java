package n04bis.es03;

public class Date {
    private int day, year;
    private int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    boolean bisestile;





    /* <---------------------------------COSTRUTTORI---------------------------------> */

        /* input GGG AAAA */
    public Date(int g, int a) {
        setDaysAndYears(g, a);
    }

        /* input GG/MM/AA */
    public Date(int g, int m, int a) {
        setDayIntMonthYear(g, m, a);
    }

        /* input GG month AAAA (Ex. 14 Giugno 1992) */
    public Date(int g, String m, int a) {                                                           
        setDayMonthYear(g, m, a);
    }

        /* input stile GMT YYYY-MM-DD */
    public Date(String gmt) {
        setGMT(gmt);
    }





    /* <---------------------------------METODI SET---------------------------------> */

        /* set GGG AAAA */
    public void setDaysAndYears(int g, int a){
        checkYear(a);
        this.year = a;
        this.day = g;

        if(this.day >= 60){
            setBisestile(a);
        }
    }

        /* set GG/MM/AA*/
    public void setDayIntMonthYear(int g, int m, int a){
        checkYear(a);
        
        this.year = a;
        if(m >= 2){
            setBisestile(a);
            checkDayFeb(g, m);
        }
        this.day = daysAndMonthToDays(g, m);
        checkDays();
    }

        /* set GG month AAAA*/
    public void setDayMonthYear(int g, String m, int a){
        checkYear(a);
        int month = stringMonthToInt(m);
        month++;
        this.year = a;
        if(month >= 1){
            setBisestile(a);
            checkDayFeb(g, month);
        }
        this.day = daysAndMonthToDays(g, month);
        checkDays();
    }

        /* set GMT YYYY-MM-DD*/
    public void setGMT(String gmt){
        String dateArray[] = gmt.split("-");
        int year = Integer.valueOf(dateArray[0]);
        checkYear(year);

        int m = Integer.valueOf(dateArray[1]);
        int g = Integer.valueOf(dateArray[2]);
        
        this.year = year;
        if(m >= 1){
            setBisestile(year);
            checkDayFeb(g, m);
        }
        this.day = daysAndMonthToDays(g, m);
        checkDays();
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

        /* Verifica validità anno */
    private void checkYear(int year){
        if (year < 0) {
            throw new UnsupportedOperationException("valore anno negativo");
        }
    }

    private void checkDayFeb(int g, int m){
        if(! ( g<=daysInMonth[m-1]) ){
            throw new IllegalStateException("Errore numero di giorni nel mese");
        }
    }

        /* Verifica giorni inseriti */
    private void checkDays(){
        if (this.day > 366 && bisestile) {
            throw new IllegalStateException("Errore numero di giorni");
        } else if(this.day > 365 && !bisestile ){
            throw new IllegalStateException("Errore numero di giorni");
        }
    }
    
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
        dm[1] = (month + 1);
        return dm;
    }

        /* CONVERT DD/MM FORMAT TO DDDD FORMAT */
    private int daysAndMonthToDays(int day, int month){
        for (int i = 0; i < month-1; i++) {
            day += this.daysInMonth[i];
        }
        return day;
    }

        /* IMPOSTA MESE BISESTILE DAL VALORE DELL'ANNO */
    private void setBisestile(int a){
        if (a % 400 == 0 || a % 4 == 0 && !(a % 100 == 0)) {                                                                
            this.daysInMonth[1] = 29;
            this.bisestile = true;
            return;
        } else {
            this.bisestile = false;
        }   
    }

        /* CONVERT STRING MONTH TO INTEGER MONTH */
    private int stringMonthToInt(String m){
        int month;
        switch (m.toLowerCase().trim()) {
            case "gennaio":
                month = 0;
                break;

            case "febbraio":
                month = 1;
                break;

            case "marzo":
                month = 2;
                break;

            case "aprile":
                month = 3;
                break;

            case "maggio":
                month = 4;
                break;

            case "giugno":
                month = 5;
                break;

            case "luglio":
                month = 6;
                break;

            case "agosto":
                month = 7;
                break;

            case "settembre":
                month = 8;
                break;

            case "ottobre":
                month = 9;
                break;

            case "novembre":
                month = 10;
                break;

            case "dicembre":
                month = 11;
                break;

            default:
                System.out.println("Errore nome mese");
                return -1;
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
