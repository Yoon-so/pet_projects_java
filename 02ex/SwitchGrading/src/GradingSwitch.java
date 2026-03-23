import java.util.Scanner;

public class GradingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char grade;
        System.out.print("Enter your grade (0~100): ");

        int score = scanner.nextInt();
        switch(score/10) {
            case 10: // score = 100
            case 9: // score는 90~99
                grade = 'A';
                break;
            case 8: //score는 80~89
                grade = 'B';
                break;
            case 7: //score는 70~79
                grade = 'C';
                break;
            case 6: //score는 60~69
                grade = 'D';
                break;
            default: //score는 0~59
                grade = 'F';
        }
        System.out.println("Your grade is " + grade + ".");
        scanner.close();
    }
}
