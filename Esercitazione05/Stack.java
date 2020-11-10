import java.util.ArrayList;

public class Stack {
    ArrayList<String> miaLista = new ArrayList<>(100);    

    public void push(String s){
        miaLista.add(s);
    }

    public void push(int i, String s){
        miaLista.add(i, s);
    }

    public String pop(){
        String temp = miaLista.get(miaLista.size()-1);
        miaLista.remove(miaLista.size()-1);
        return temp;
    }

    public String pop(int i){
        if(i > miaLista.size()-1){
            i = miaLista.size()-1;
        }
        String temp = miaLista.get(i);
        miaLista.remove(i);
        return temp;
    }

    public boolean isEmpty(){
        if(miaLista.size() == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(miaLista.size() == 100){
            return true;
        }
        return false;
    }

    public String toString(){
        return "";
    }

    public boolean equals(){
        return false;
    }

}
