package zad1;

public class TestGames {
    public static void main(String[] args) {
        double[] ratings1 = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] ratings2 = {0.0, 2.5, 2.3, 2.1, 4.9};

        ComputerGame game1 = new ComputerGame("Warhammer", "SEGA", ratings1);
        ComputerGame game2 = new ComputerGame("Fartnite", "EpicGames", ratings2);

        System.out.println(game1);

        game2.addRating(1.0);
        System.out.println(game2);

        game2.removeRating(4);
        System.out.println(game2);

        System.out.println(game2.hashCode());
        System.out.println(game2.equals(game1));
    }
}
