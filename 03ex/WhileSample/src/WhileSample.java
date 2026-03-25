import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (-1 to stop).");

        int n = scanner.nextInt();
        while(n != -1) {
            sum += n;
            count++;
            n = scanner.nextInt();
        }
        if(count == 0) System.out.println("No numbers were entered.");
        else {
            System.out.print("Number of inputs: " + count);
            System.out.println(", Average: " + (double)sum / count);
        }
        scanner.close();
    }
}
