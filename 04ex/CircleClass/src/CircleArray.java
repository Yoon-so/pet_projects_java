class Circle4 {
    int radius;
    public Circle4 (int radius) { 
        this.radius = radius; 
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class CircleArray {
    public static void main (String [] args) {
        Circle4 [] c;
        c = new Circle4[5];

        for (int i = 0; i < c.length; i++) {
            c[i] = new Circle4(i);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print((int)c[i].getArea() + " ");
        }
    }
}
