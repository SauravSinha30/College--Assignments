public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point o) {
        this.x = o.x;
        this.y = o.y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Point point1 = new Point(5, 10);
        Point point2 = new Point(point1);

        System.out.println("Point1 - X: " + point1.getX() + ", Y: " + point1.getY());
        System.out.println("Point2 - X: " + point2.getX() + ", Y: " + point2.getY());

        point1.setX(20);
        point1.setY(30);

        System.out.println("Point1 - X: " + point1.getX() + ", Y: " + point1.getY());
        System.out.println("Point2 - X: " + point2.getX() + ", Y: " + point2.getY());
    }
}
