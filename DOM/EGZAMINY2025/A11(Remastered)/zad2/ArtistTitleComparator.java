package zad2;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        int result = o1.getTitle().compareTo(o2.getTitle());
        if (result == 0) {
            return o1.getArtist().compareTo(o2.getArtist());
        }
        return result;
    }
}
