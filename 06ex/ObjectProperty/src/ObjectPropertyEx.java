class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

public class ObjectPropertyEx {
    public static void main(String[] args)  {
        Point p = new Point(2, 3);
        System.out.println(p.getClass().getName());
        System.out.println(p.hashCode());
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println("This is the point: " + p);
    }
}
