public class Circle2 {
    int radius;
    public Circle2(int radius) {
        this.radius = radius;
    }
    public void set(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle2 ob1 = new Circle2(1);
        Circle2 ob2 = new Circle2(2);
        Circle2 ob3 = new Circle2(3);
        System.out.println(ob1.radius + " " + ob2.radius + " " + ob3.radius );

        ob1.set(4);
        ob2.set(5);
        ob3.set(6);
        System.out.println(ob1.radius + " " + ob2.radius + " " + ob3.radius );
    }   
}
