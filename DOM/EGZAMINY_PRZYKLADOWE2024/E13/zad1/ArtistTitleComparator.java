package zad1;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        int result = o1.getArtist().compareTo(o2.getArtist());
        if (result == 0) {
            return o2.getTitle().compareTo(o1.getTitle());
        }
        return result;
    }
}
