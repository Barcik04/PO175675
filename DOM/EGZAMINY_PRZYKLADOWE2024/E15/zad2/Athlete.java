package zad2;

public record Athlete(String name, String sport, int yearOfAchivement) implements Comparable<Athlete> {
    @Override
    public int compareTo(Athlete other) {
        return Integer.compare(this.yearOfAchivement, other.yearOfAchivement);
    }
}
