public class Studente {
    private String nome, cognome;
    private Date2 nascita;
    private long matricola;

        /* <---------------------------COSTRUTTORI------------------------------------> */
    public Studente(String nome, String cognome, long matricola, Date2 nascita){
        setNome(nome);
        setCognome(cognome);
        setData(nascita);
        if(matricola == 0){
            System.out.println("Errore matricola");
            return;
        }
        this.matricola = matricola;
    }

    public Studente(String nome, String cognome, long matricola, int gn, int mn, int an){
        this(nome, cognome, matricola, new Date2(gn, mn, an));
    }


        /* <--------------------------METODI SET-----------------------------------> */
    public void setNome(String nome){
        if(nome.equals("")){
            System.out.println("Errore nome");
            return;
        }
        this.nome = nome;
    }

    public void setCognome(String cognome){
        if(cognome.equals("")){
            System.out.println("Errore cognome");
            return;
        }
        this.cognome = cognome;
    }

    public void setData(Date2 nascita){
        if(nascita == null){
            System.out.println("Errore data nascita");
            return;
        }
        this.nascita = nascita;
    }


        /* <--------------------------METODI GET-----------------------------------> */
    public String getNome(){
        return this.nome;
    }

    public String getCognome(){
        return this.cognome;
    }

    public Date2 getData(){
        return this.nascita;
    }

    public String toString(){
        return this.nome + " " + this.cognome + " " + this.matricola + " " + this.nascita;
    }
}
