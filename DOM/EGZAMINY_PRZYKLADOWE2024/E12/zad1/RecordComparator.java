package zad1;

import java.util.Comparator;

public class RecordComparator implements Comparator<Athlete> {
    public int compare(Athlete a, Athlete b) {
        return Double.compare(a.getMaxRecord(), b.getMaxRecord());
    }
}
