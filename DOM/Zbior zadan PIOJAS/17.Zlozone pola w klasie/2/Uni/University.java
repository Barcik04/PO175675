package Uni;

import java.util.List;
import java.util.Objects;

public class University {
    protected String name;
    protected String location;
    protected List<String> studyPrograms;

    public void addProgram(String program) {
        studyPrograms.add(program);
    }

    public void removeProgram(String program) {
        studyPrograms.remove(program);
    }

    public University(String name, String location, List<String> studyPrograms) {
        this.name = name;
        this.location = location;
        this.studyPrograms = studyPrograms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getStudyPrograms() {
        return studyPrograms;
    }

    public void setStudyPrograms(List<String> studyPrograms) {
        this.studyPrograms = studyPrograms;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("University name: ").append(name).append("\n");
        sb.append("University location: ").append(location).append("\n\n");
        sb.append("University study programs: ").append("\n");
        for (String program : studyPrograms) {
            sb.append(program).append("\n");
        }

        sb.append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(name, that.name) && Objects.equals(location, that.location) && Objects.equals(studyPrograms, that.studyPrograms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, studyPrograms);
    }
}
