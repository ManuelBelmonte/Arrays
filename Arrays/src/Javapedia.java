import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //en este ejercico hare un aray 2d que almacena informacion, https://www.learnthepart.com/course/2e619a47-76f5-444e-8e86-e712631518a7/2d3192d1-d69b-4626-9fa2-c09b5b7f49cc
        System.out.println("*********Javapedia*********");
        System.out.println("How many historical figures will you register? ");
        int register = scan.nextInt();
        String[][] database = new String[register][3];
        scan.nextLine();

        for (int i = 0; i < database.length; i++) {
            System.out.println("Figure "+(i+1));
            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();
            System.out.print("\n");
            }
        System.out.println("These are the values you stored:");
        print2DArray(database);

        System.out.print("\nWho do you want information on? ");
        String name = scan.nextLine();

        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equals(name)) {
                System.out.println("\tName: " + database[i][0]);
                System.out.println("\tDate of birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
            }
        }        System.out.println("These are the values you stored:");
        print2DArray(database);

        System.out.print("\nWho do you want information on? ");
        String people = scan.nextLine();

        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equals(people)) {
                System.out.println("\tName: " + database[i][0]);
                System.out.println("\tDate of birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
            }
        }

    }

    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }


    }


