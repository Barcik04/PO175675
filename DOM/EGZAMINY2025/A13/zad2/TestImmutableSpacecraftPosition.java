package zad2;

public class TestImmutableSpacecraftPosition {
    public static void main(String[] args) {
        ImmutableSpacecraftPosition obj1 = new ImmutableSpacecraftPosition(1, 2, 3);
        System.out.println(obj1);

        ImmutableSpacecraftPosition newObj = obj1.move(19, -2, 33);
        System.out.println(newObj);
    }
}
