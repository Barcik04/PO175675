package zad1;

import java.util.ArrayList;
import java.util.Objects;

public class MusicStore {
    private String name;
    private String city;
    private ArrayList<String> albumNames;

    public MusicStore(String name, String city, ArrayList<String> albumNames) {
        this.name = name;
        this.city = city;
        this.albumNames = albumNames != null ? new ArrayList<>(albumNames) : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getAlbumNames() {
        return new ArrayList<>(albumNames);
    }

    public void setAlbumNames(ArrayList<String> albumNames) {
        this.albumNames = albumNames != null ? new ArrayList<>(albumNames) : new ArrayList<>();
    }

    public void addAlbum(String album) {
        this.albumNames.add(album);
    }

    public void removeAlbum(String album) {
        this.albumNames.remove(album);
    }

    @Override
    public String toString() {
        return "name: " + name + ", city: " + city + "\nalbumNames: \n" + albumNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicStore that = (MusicStore) o;
        return Objects.equals(name, that.name) && Objects.equals(city, that.city) && Objects.equals(albumNames, that.albumNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, albumNames);
    }
}
