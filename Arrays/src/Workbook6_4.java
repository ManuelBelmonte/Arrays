import java.util.Scanner;

public class Workbook6_4 {
    public static void main(String[] args) {
        //en este codigo usaremos el workbook 6.3 pero aqui se le preguntara al usuario que busca
        System.out.println("Welcome to Java Grocery\nWhat can I help you find");
        String [] grocery = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        Scanner scan = new Scanner(System.in);
         String item = scan.nextLine();

        for (int i = 0; i < grocery.length ; i++) {
            if(item.equals(grocery[i])){
                System.out.println("We have that in aisle "+i);
                break;
            }
        }
    }
}
