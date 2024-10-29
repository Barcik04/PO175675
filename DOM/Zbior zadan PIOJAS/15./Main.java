import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Team team1 = new Team("Cotton Pickers", "Las Vegas", list);

        SoccerTeam soccerTeam = new SoccerTeam("Cotton Pickers", "New Hampshire", list, 12);
        soccerTeam.setCity("Lordshire");
        System.out.println(soccerTeam);
    }
}