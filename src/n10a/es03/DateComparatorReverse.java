package n10a.es03;

import java.util.Comparator;

public class DateComparatorReverse implements Comparator<Date> {
    public int compare(Date d1, Date d2){
        return -d1.compareTo(d2);
    }
}
