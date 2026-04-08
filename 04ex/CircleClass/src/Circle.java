public class Circle {
    int radius;
    String name;

    public Circle() {}

    public double getArea() {
        return 3.14 * radius * radius;
    }
    public static void main(String[] args) {
        Circle pizza;
        pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "Javapizza";
        double area = pizza.getArea();
        System.out.println("Area of the " + pizza.name + " is " + area);
 
        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "Javadonut";
        area = donut.getArea();
        System.out.println("Area of the " + donut.name + " is " + area);
    }
}
