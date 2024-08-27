import java.util.Scanner;

public class Workbook6_10 {
    public static void main(String[] args) {
        System.out.println("How many pizza toppings do you want?");
        Scanner scan = new Scanner(System.in);
        int toppings = scan.nextInt();
        System.out.println("Great, enter each topping!");
        String [] newToppings = new String[toppings];
        scan.nextLine();

        for (int i = 0; i < newToppings.length; i++) {
            System.out.print(i+". ");
            newToppings[i] =scan.nextLine();
        }
        System.out.println("\nThank you! Here are the toppings you ordered");
        for (int i = 0; i < newToppings.length; i++) {
            System.out.println(i + ". " + newToppings[i]);
        }
        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();
    }
}
