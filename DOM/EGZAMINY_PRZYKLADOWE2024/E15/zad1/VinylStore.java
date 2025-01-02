package zad1;

import java.util.ArrayList;
import java.util.Objects;

public class VinylStore extends MusicStore{
    private int numberOfVinyls;

    public VinylStore(String name, String city, ArrayList<String> albumNames) {
        super(name, city, albumNames);
        this.numberOfVinyls = albumNames.size();
    }

    public int getNumberOfVinyls() {
        return numberOfVinyls;
    }

    public void setNumberOfVinyls(int numberOfVinyls) {
        this.numberOfVinyls = numberOfVinyls;
    }

    @Override
    public String toString() {
        return super.toString() + " number of vinyls: " + numberOfVinyls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VinylStore that = (VinylStore) o;
        return numberOfVinyls == that.numberOfVinyls;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfVinyls);
    }
}
