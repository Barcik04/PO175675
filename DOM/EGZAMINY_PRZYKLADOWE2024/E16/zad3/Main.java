package zad3;

public class Main {
    public static <T> void swapElements(T[] arr, int start, int end) {
        if (start > arr.length - 1 || end > arr.length - 1) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        T temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        VideoGame[] games = {
                new VideoGame("BO2", "Activision", 3.9f),
                new VideoGame("RDD", "Activision", 4.2f),
                new VideoGame("Fortnite", "Activision", 3.2f),
                new VideoGame("Minecraft", "Activision", 4.2f),
        };

        swapElements(games, 0, 2);

        for (VideoGame game : games) {
            System.out.println(game);
        }
    }
}
