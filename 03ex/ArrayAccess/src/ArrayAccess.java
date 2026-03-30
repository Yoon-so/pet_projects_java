import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[5];

        int min = 0;
        System.out.println("Enter 5 integers:");
        for(int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt();

            if(i == 0 || intArray[i] < min) 
                min = intArray[i];
        }
        System.out.println("The minimum value is: " + min);
        scanner.close();
    }
}
