package zad2;

import java.util.Comparator;

public class DurationTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        int result = Integer.compare(o1.duration(), o2.duration());
        if (result == 0) {
            return o1.title().compareTo(o2.title());
        }
        return result;
    }
}
