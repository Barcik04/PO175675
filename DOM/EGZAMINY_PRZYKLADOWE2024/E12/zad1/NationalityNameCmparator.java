package zad1;

import java.util.Comparator;

public class NationalityNameCmparator implements Comparator<Athlete> {
    public int compare(Athlete a, Athlete b) {
        int result = b.getNationality().compareToIgnoreCase(a.getNationality());
        if (result == 0) {
            return b.getName().compareToIgnoreCase(a.getName());
        }
        return result;
    }
}
