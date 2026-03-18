import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        System.out.println("Please, enter your name, city, age, weight and if you are single: ");
        
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.print("Name " + name + ", ");

        String city = scanner.next();
        System.out.print("city " + city + ", ");

        int age = scanner.nextInt();
        System.out.print("age " + age + ", ");

        double weight = scanner.nextDouble();
        System.out.print("weight " + weight + " kg, ");

        boolean single = scanner.nextBoolean();
        System.out.println("are you single: " + single);

        scanner.close();

    }
}