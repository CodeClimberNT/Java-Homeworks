package n08.es05;

public class MyStackOverflow extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String data = "";

    public MyStackOverflow() {
        super("Inserimento fallito: Stack pieno");
    }

    public MyStackOverflow(String data) {
        super(data + " non inserito: Stack pieno");
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
