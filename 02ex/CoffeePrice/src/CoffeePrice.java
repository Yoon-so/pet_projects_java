import java.util.Scanner;

public class CoffeePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What coffee would you like? ");
        String order = scanner.next();
        int price = 0;
         
        switch (order) {
            case "espresso":
            case "latte":
            case "cappuccino":
                price = 3500;
                break;
            case "americano":
                price = 2000;
                break;
            default:
                System.out.println("Sorry, we don't have that coffee.");
        }
        if(price != 0) 
            System.out.println("The price of your " + order + " is " + price + " won.");
        scanner.close();
    }
}
