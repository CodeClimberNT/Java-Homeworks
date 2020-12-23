package n02.es02;

public class TestTipo{
    public static void main(String args[]){
        int a = 5, b = 3, i = 6;
        short s = 5000;
        float f = 3.14F;
        char c = 'a';

        int r1 = a/b;
        int r2 = c * s;
        float r3 = i + f;
        float r4 = r1-r2-r3;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
