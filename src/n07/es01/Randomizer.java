package n07.es01;

public abstract class Randomizer {
    public int output;

    public Randomizer(int output) {
        setOutput(output);
    }

    private void setOutput(int output) {
        if(output == 1 || output == 6) {
            this.output = output;
        } else {
            this.output = 1;
        }
    }

    public abstract String lancia(); 

}