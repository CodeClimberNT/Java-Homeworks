package src.taormina.prg.n05.es02;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> data = new ArrayList<>(100);

    public void push(String s){
        this.data.add(s);
    }

    public void push(int i, String s) throws Exception {
        if(isFull()) {
            throw new Exception("Hai superato il limite di stringhe!");
        }
        this.data.add(i, s);
    }

    public String pop(){
        String temp = null;
        if(!data.isEmpty()){
            return data.remove(data.size()-1);
        }
        return temp;
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public boolean isFull(){
        if(this.data.size() == 100){
            return true;
        }
        return false;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (String s : this.data){
            sb.append(s);
            sb.append("\t");
        }
        return sb.toString();
    }

    public boolean equals(ArrayList<String> altra){
        return this.data.equals(altra);
    }

}
