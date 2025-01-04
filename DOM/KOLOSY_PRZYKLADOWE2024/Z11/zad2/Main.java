package zad2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<VideoGame> games = new ArrayList<>();
        games.add(new VideoGame("Igor", "Activision", 12.2f));
        games.add(new VideoGame("Afdam", "Blizzard", 11.2f));
        games.add(new VideoGame("Zygrfyd", "Mojang", 1.0f));

        Collections.sort(games);
        for (VideoGame game : games) {
            System.out.println(game);
        }
    }
}
