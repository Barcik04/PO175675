package zad1;

public class TestImmutableYachtPosition {
    public static void main(String[] args) {
        ImmutableYachtPosition im1 = new ImmutableYachtPosition(18.0, 110.0, 1.0);
        System.out.println(im1);


        System.out.println(im1.move(1.0, 2.0, 3.0));
    }
}
