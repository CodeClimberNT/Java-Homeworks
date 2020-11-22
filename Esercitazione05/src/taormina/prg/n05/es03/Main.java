package src.taormina.prg.n05.es03;

public class Main {
    public static void main(String args[]){
        IntegerSet p1 = new IntegerSet();
        IntegerSet p2 = new IntegerSet();


        p1.insertElement(3);
        p1.insertElement(4);
        p1.insertElement(5);
        p2.insertElement(5);
        p2.insertElement(6);
        p2.insertElement(7);
        p2.insertElement(8);
        System.out.println(p1.unionOfIntegerSet(p2));
        System.out.println(p1.intersectionOfIntegerSet(p2));
        System.out.println(p1);
        System.out.println(p2);

    }
}
