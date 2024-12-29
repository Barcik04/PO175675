package zad2;

public class TestArtGallery {
    public static void main(String[] args) {
        ArtGallery result = ArtGallery.getInstance("Jurek");
        System.out.println(result);
        ArtGallery result2 = ArtGallery.getInstance("Ogorek");
        System.out.println(result2);

        if (result2.equals(result)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println(result2.getName());
    }
}
