package n08.es05;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> data = new ArrayList<>(100);

    public void push(String s) throws MyStackOverflow {
        if(isFull()) {
            throw new MyStackOverflow(s);
        }
        this.data.add(s);
    }

    public void push(int i, String s) throws MyStackOverflow {
        if(isFull()) {
            throw new MyStackOverflow(s);
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
        if(this.data.size() >= 100){
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
