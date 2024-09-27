//Carlinbhert Adryanne De Guzman
//cc2 - Laboratory 5
//September 27, 2024
import java.util.Scanner;

public class RestaurantOrder {
    public static void main(String[] args) {

//        Scanner to take user input and with menu displayed
        Scanner mySystem = new Scanner(System.in);
        System.out.println("Select an item that you want to order: ");
        System.out.println("1. Burger    - PHP 100");
        System.out.println("2. Fries     - PHP 50");
        System.out.println("3. Soda      - PHP 30");
        System.out.println("4. Ice Cream - PHP 45");
        System.out.println("5. Exit");
//        create variables for each item
        int userChoice = mySystem.nextInt();
        int burger, fries, soda, iceCream;

//        if statement for inputs 1-4
    if (userChoice >= 1 && userChoice <= 4) {
//        switch statement for each individual item
        switch (userChoice) {

//            quantity and total amount variables are created to take user input and calculate the total item price
            case 1:
                System.out.print("Enter the quantity: ");
                int quantityB = mySystem.nextInt();
                System.out.println("You ordered Burgers.");
                burger = 100;
                int totalAmountB = quantityB * burger;
                System.out.println("Total amount: " + totalAmountB + " PHP");
                break;
            case 2:
                System.out.print("Enter the quantity: ");
                int quantityF = mySystem.nextInt();
                System.out.println("You ordered Fries.");
                fries = 50;
                int totalAmountF = quantityF * fries;
                System.out.println("Total amount: " + totalAmountF + " PHP");
                break;
            case 3:
                System.out.print("Enter the quantity: ");
                int quantityS = mySystem.nextInt();
                System.out.println("You ordered Soda.");
                soda = 30;
                int totalAmountS = quantityS * soda;
                System.out.println("Total amount: " + totalAmountS + " PHP");
                break;
            case 4:
                System.out.print("Enter the quantity: ");
                int quantityI = mySystem.nextInt();
                System.out.println("You ordered Ice Cream.");
                iceCream = 50;
                int totalAmountI = quantityI * iceCream;
                System.out.println("Total amount: " + totalAmountI + " PHP");
                break;
//                case 5 which uses the break function to exit the program
            case 5:
                break;
//                default statement to tell user to input a valid number
            default:
                System.out.println("Please enter a valid input");
            }
        }
    }
}
