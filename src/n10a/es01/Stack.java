package n10a.es01;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> data;

    public Stack(){
        data = new ArrayList<>();
    }

    public void push(T s){
        this.data.add(s);
    }

    public void push(int i, T s) throws Exception {
        if(isFull()) {
            throw new Exception("Hai superato il limite di stringhe!");
        }
        this.data.add(i, s);
    }

    public T pop(){
        String temp = null;
        if(!data.isEmpty()){
            return data.remove(data.size()-1);
        }
        return null;
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

    public boolean equals(ArrayList<T> altra){
        return this.data.equals(altra);
    }

}
