package n10a.es03;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestData {
    public static void main(String args[]) {
        List<Date> l = new ArrayList<>();

        l.add(new Date(23, 12, 2020));
        l.add(new Date(100, 2020));
        l.add(new Date(1, 1, 1970));
        l.add(new Date(25, 4, 1945));

        System.out.println(l);

        l.sort(new DateComparatorReverse());
        System.out.println(l);
        Collections.shuffle(l);
        System.out.println(l);

    }
}
