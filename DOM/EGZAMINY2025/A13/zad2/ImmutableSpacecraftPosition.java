package zad2;

public final class ImmutableSpacecraftPosition {
    private final int x;
    private final int y;
    private final int z;

    public ImmutableSpacecraftPosition(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y + ", z: " + z;
    }

    public ImmutableSpacecraftPosition move(int xChange, int yChange, int zChange) {
        return new ImmutableSpacecraftPosition(xChange + this.x, yChange + this.y, zChange + this.z);
    }
}
