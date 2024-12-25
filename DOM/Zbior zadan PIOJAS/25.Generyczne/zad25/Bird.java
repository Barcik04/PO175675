package zad25;

public class Bird {
    private String birdName;
    private int birdAge;

    public Bird(String birdName, int birdAge) {
        this.birdName = birdName;
        this.birdAge = birdAge;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public int getBirdAge() {
        return birdAge;
    }

    public void setBirdAge(int birdAge) {
        this.birdAge = birdAge;
    }

    @Override
    public String toString() {
        return "birdName: " + birdName + ", birdAge: " + birdAge;
    }
}
