import java.util.ArrayList;
import java.util.Objects;

public class VollayBallTeam extends Team {
    public int numberOfVictories;

    public VollayBallTeam(String name, String city, ArrayList<Integer> points, int numberOfVictories) {
        super(name, city, points);
        this.numberOfVictories = numberOfVictories;
    }


    public int getNumberOfVictories() {
        return numberOfVictories;
    }
    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VollayBallTeam that)) return false;
        if (!super.equals(o)) return false;
        return numberOfVictories == that.numberOfVictories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfVictories);
    }
}
