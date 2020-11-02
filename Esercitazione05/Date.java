public class Date {
    private int day, year, temp;
    private int daysInMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private String month, completeString;
    private boolean flag = false;

    public Date(int g, int a) { // input GGG AAAA
        if (a < 0) {
            System.out.println("Non posso calcolare anni prima di Cristo");
            return;
        }
        this.year = a;
        if (this.year % 400 == 0) { // calcolo mese bisestile
            this.daysInMonth[1] = 29;
            if (g > 366) {
                System.out.println("Errore inserimento dati");
                return;
            }
        } else if (this.year % 4 == 0 && !(this.year % 100 == 0)) {
            this.daysInMonth[1] = 29;
            if (g > 366) {
                System.out.println("Errore inserimento dati");
                return;
            }
        }
        if (g > 365) {
            System.out.println("Errore inserimento dati");
            return;
        }
        this.day = g;

    }

    public Date(int g, int m, int a) { // input GG/MM/AA
        if (a < 0) {
            System.out.println("Non posso calcolare anni prima di Cristo");
            return;
        }
        if (m > 12) {
            System.out.println("Errore numero del mese");
        }
        if (g > daysInMonth[m - 1]) {
            System.out.println("Errore inserimento dati");
            return;
        }

        this.year = a;
        if (this.year % 400 == 0) { // calcolo mese bisestile
            this.daysInMonth[1] = 29;
        } else if (this.year % 4 == 0 && !(this.year % 100 == 0)) {
            this.daysInMonth[1] = 29;
        }

        this.day = g;
        for (int i = 0; i < m - 1; i++) {
            this.day += this.daysInMonth[i];
        }
    }

    public Date(int g, String m, int a) { // input GG month AAAA (Ex. 14 Giugno 1992)
        if (a < 0) {
            System.out.println("Non posso calcolare anni prima di Cristo");
            return;
        }

        this.year = a;
        if (this.year % 400 == 0) { // calcolo mese bisestile
            this.daysInMonth[1] = 29;
        } else if (this.year % 4 == 0 && !(this.year % 100 == 0)) {
            this.daysInMonth[1] = 29;
        }

        int month = 0;
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
                return;
        }
        this.day = g;
        for (int i = 0; i < month - 1; i++) {
            this.day += this.daysInMonth[i];
        }
    }

    public Date(String gmt) { // input stile gmt yyyy-mm-dd
        String dateArray[] = gmt.split("-");
        this.year = Integer.valueOf(dateArray[0]);

        if (this.year < 0) {
            System.out.println("Non posso calcolare anni prima di Cristo");
            return;
        }

        if (this.year % 400 == 0) { // calcolo mese bisestile
            this.daysInMonth[1] = 29;
        } else if (this.year % 4 == 0 && !(this.year % 100 == 0)) {
            this.daysInMonth[1] = 29;
        }

        int month = Integer.valueOf(dateArray[1]);
        if (month > 12) {
            System.out.println("Errore numero del mese");
        }

        this.day = Integer.valueOf(dateArray[2]);
        if (this.day > this.daysInMonth[month - 1]) {
            System.out.println("Errore numero di giorni");
        }

        for (int i = 0; i < month - 1; i++) {
            this.day += this.daysInMonth[i];
        }
        System.out.println(this.day);
    }

    public String toString() { // metodo toString
        flag = true;
        stampa3();
        return completeString;
    }

    public boolean equals(Date altro) { // metodo equals tra due date
        if (this.day == altro.day && this.year == altro.year) {
            return true;
        }
        return false;
    }

    public void stampa1() { // stampa stile GGG AAAA
        System.out.println(this.day + " " + this.year);
    }

    public void stampa2() { // stampa stile GG/MM/AA
        temp = this.day;
        int i;
        for (i = 0; i < daysInMonth.length; i++) {
            if (temp > daysInMonth[i]) {
                temp -= daysInMonth[i];
            } else {
                break;
            }
        }

        System.out.println(temp + "/" + (i + 1) + "/" + Math.abs(this.year % 100));
    }

    public void stampa3() { // stampa stile GG month AAAA
        int temp = this.day;
        int i;
        for (i = 0; i < daysInMonth.length; i++) {
            if (temp > daysInMonth[i]) {
                temp -= daysInMonth[i];
            } else {
                break;
            }
        }
        i++;
        switch (i) {
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
                return;
        }

        completeString = temp + " " + month + " " + this.year;
        if (!flag) {
            System.out.println(temp + " " + month + " " + this.year);
        }
        flag = false;
    }

    public void stampa4() { // stampa stile gtm yyyy-mm-dd
        int temp = this.day;
        int i;
        for (i = 0; i < daysInMonth.length; i++) {
            if (temp > daysInMonth[i]) {
                temp -= daysInMonth[i];
            } else {
                break;
            }
        }
        i++;
        System.out.println(this.year + "-" + String.format("%02d", i) + "-" + String.format("%02d", temp));
    }

}
