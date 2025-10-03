package mohirdev.oop_methodOverloading_constructor;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public static void main(String[] args) {
        Point point = new Point(3, 4, 5);
        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.getZ());
    }
}
