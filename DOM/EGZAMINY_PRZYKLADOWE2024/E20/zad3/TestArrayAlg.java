package zad3;

public class TestArrayAlg {
    public static void main(String[] args) {
        VideoGame[] games = {
                new VideoGame("RDR", "Rockstar", 4.8f),
                new VideoGame("GTA", "Rockstar", 4.6f),
                new VideoGame("RDR2", "Rockstar", 4.9f),
                new VideoGame("Minecraft", "Mojang", 5.0f),
        };

        System.out.println(Main.findMaxIndex(games));
    }
}
