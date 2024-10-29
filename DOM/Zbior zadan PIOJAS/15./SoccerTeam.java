import java.util.ArrayList;
import java.util.Objects;

public class SoccerTeam extends Team {
    public int rankingPosition;

    public SoccerTeam(String name, String city, ArrayList<Integer> points, int rankingPosition) {
        super(name, city, points);
        this.rankingPosition = rankingPosition;
    }

    public int getRankingPosition() {
        return rankingPosition;
    }
    public void setRankingPosition(int rankingPosition) {
        this.rankingPosition = rankingPosition;
    }

    public String toString() {
        return super.toString() + "\nRanking Position: " + rankingPosition + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SoccerTeam that)) return false;
        if (!super.equals(o)) return false;
        return rankingPosition == that.rankingPosition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rankingPosition);
    }
}
