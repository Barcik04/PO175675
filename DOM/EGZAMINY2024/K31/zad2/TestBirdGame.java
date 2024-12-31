package zad2;

public class TestBirdGame {
    public static void main(String[] args) {
        BirdGame bg1 = new BirdGame("Igor", "PVP", 199);
        BirdGame bg2 = new BirdGame("Igor", "PVP", 199);
        BirdGame bg3 = new BirdGame("Jurek", "PVP", 199);

        System.out.println(bg1.compareTo(bg2));
        System.out.println(bg1.compareTo(bg3));
        System.out.println(bg2.equals(bg1));
        System.out.println(bg2.equals(bg3));
    }
}
