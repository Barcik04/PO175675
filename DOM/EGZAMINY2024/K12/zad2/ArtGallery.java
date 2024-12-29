package zad2;

public class ArtGallery {
    private String name;
    private static ArtGallery instance;

    public ArtGallery(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArtGallery getInstance(String name) {
        if (instance == null) {
            instance = new ArtGallery(name);
        }

        return instance;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
