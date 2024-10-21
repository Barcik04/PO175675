public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public double distance(Point2D otherPoint) {
        return Math.sqrt(Math.pow(otherPoint.getX() - this.x, 2) + (Math.pow(otherPoint.getY() - this.y, 2)));
    }

    public static void main(String[] args) {
        Point2D point1 = new Point2D(1, 2);
        Point2D point2 = new Point2D(3, 4);
        point2.setY(10);
        System.out.println(point2.getY());
        double distance = point1.distance(point2);
        System.out.println(distance);
    }
}
