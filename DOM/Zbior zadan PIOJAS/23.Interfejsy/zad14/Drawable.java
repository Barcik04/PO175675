package zad14;

public interface Drawable {
    void draw();
    void display();
    static String getType() {
        return "Drawable Type";
    }
}
