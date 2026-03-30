import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter \"exit\" to stop the program.");
        while(true) {
            System.out.print(">>");
            String text = scanner.nextLine();
            if(text.equals("exit"))
                break;
        }
        System.out.println("Program stopped.");
        scanner.close();
    }
}
