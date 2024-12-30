package zad2;

public class TestBuildingMaterial {
    public static void main(String[] args) {
        BuildingMaterial b1 = new BuildingMaterial("Rock", "5/5", 12);
        BuildingMaterial b2 = new BuildingMaterial("Wood", "4/5", 122);

        System.out.println(b1.getQuentityInStock());
        System.out.println(b2.getQuentityInStock());

        System.out.println(b1.isSufficientQuantity());
        System.out.println(b2.isSufficientQuantity());

    }
}
