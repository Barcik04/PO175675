package Uni;

import java.util.List;
import java.util.Objects;

public class TechnicalUniversity extends University {
    protected int numberOfLab;

    public TechnicalUniversity(String name, String location, List<String> studyPrograms, int numberOfLab) {
        super(name, location, studyPrograms);
        this.numberOfLab = numberOfLab;
    }

    public int getNumberOfLab() {
        return numberOfLab;
    }

    public void setNumberOfLab(int numberOfLab) {
        this.numberOfLab = numberOfLab;
    }

    @Override
    public String toString() {
        return super.toString() + "number of Labs: " + numberOfLab;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TechnicalUniversity that)) return false;
        if (!super.equals(o)) return false;
        return numberOfLab == that.numberOfLab;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfLab);
    }
}
