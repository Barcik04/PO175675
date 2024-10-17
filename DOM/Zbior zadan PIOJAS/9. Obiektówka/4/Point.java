public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint) {
        int px = x - otherPoint.x;
        int py = y - otherPoint.y;
        return Math.sqrt(px * px + py * py);
    }
}
