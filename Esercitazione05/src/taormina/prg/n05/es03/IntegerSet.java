package src.taormina.prg.n05.es03;

public class IntegerSet {
    private boolean set[] = new boolean[100];

    public IntegerSet(){
        for (int i = 0; i < this.set.length; i++) {
            set[i] = false;
        }
    }

    public void insertElement(int value){
        if (value < this.set.length ) {
            set[value] = true;
        }
    }

    public void deleteElement(int value){
        if (value < this.set.length ) {
            set[value] = false;
        }
    }

    public IntegerSet unionOfIntegerSet(IntegerSet altro){
        IntegerSet unione = new IntegerSet();
        for (int i = 0; i < this.set.length; i++) {
            if (this.set[i] || altro.set[i]) {
                unione.set[i] = true;
            }
        }
        return unione;
    }

    public IntegerSet intersectionOfIntegerSet(IntegerSet altro){
        IntegerSet intersezione = new IntegerSet();
        for (int i = 0; i < this.set.length; i++) {
            if (this.set[i] && altro.set[i]) {
                intersezione.set[i] = true;
            }
        }
        return intersezione;
    }

    
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < set.length; i++) {
            if(set[i]) {
                result.append(i);
                result.append(" ");
            }
        }
        return result.toString();
    }
}
