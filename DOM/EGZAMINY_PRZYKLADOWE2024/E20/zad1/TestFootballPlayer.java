package zad1;

public class TestFootballPlayer {
    public static void main(String[] args) {
        FootballPlayer fb1 = new FootballPlayer("Igor", new int[]{1, 2, 3, 4, 5});

        try {
            FootballPlayer fb2 = fb1.clone();

            fb1.changeValByIndex(fb1.getGoals().length - 1, 100);

            System.out.println(fb1);
            System.out.println(fb2);
        } catch (CloneNotSupportedException e) {
            System.out.println("clone not supported");
        }
    }
}
