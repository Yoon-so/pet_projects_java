import java.util.Scanner;

public class Grading2 {
    public static void main(String[] args) {
        char grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (0~100): ");
        int score = scanner.nextInt();
        if(score < 60) //score < 60
            grade = 'F';
        else if(score < 70) //score < 70
            grade = 'D';
        else if(score < 80) //score < 80 
            grade = 'C';
        else if(score < 90) //score < 90
            grade = 'B';
        else //score > 90
            grade = 'A';
        System.out.println("Your grade is " + grade + ".");
        scanner.close();
    }
}
