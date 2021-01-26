
public class Point {

    int x;
    int y;
    Point parent;

    public Point(int x, int y, Point parent) {
        this.x = x;
        this.y = y;
        this.parent = parent;
    }

    public Point getParent() {
        return this.parent;
    }

    public String toString() {
        return "x = " + x + " y = " + y;
    }

    public int xdondur() {
        return x;
    }

    public int ydondur() {
        return y;
    }
}
