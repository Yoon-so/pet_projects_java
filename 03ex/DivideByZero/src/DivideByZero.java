import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend;
        int divisor;

        while(true){ 
            System.out.print("Enter the dividend: ");
            dividend = scanner.nextInt();
            System.out.print("Enter the divisor: ");
            divisor = scanner.nextInt();
            try {
                System.out.println(dividend + " / " + divisor + " = " + dividend / divisor);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero. Try again.");
            }
        }
        scanner.close();
    }
}
