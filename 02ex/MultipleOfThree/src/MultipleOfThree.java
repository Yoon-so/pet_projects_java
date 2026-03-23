import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if (number % 3 == 0)
            System.out.println("Is a multiple of 3.");
        else
            System.out.println("Is not a multiple of 3.");

        in.close();
    }
}
