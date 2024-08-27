public class Workbook6_11 {
    public static void main(String[] args) {
        //celcius y faherenheti
        double [] celcius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        System.out.print("Celcius: ");
        double [] fahrenheit = new double[celcius.length];

        for (int i = 0; i < celcius.length; i++) {
            System.out.print(" "+celcius[i]);
            fahrenheit[i] = 1.8 * celcius[i] +32;
        }
        System.out.println(" ");

        System.out.print("Farhenheit: ");
        for (int i = 0; i < fahrenheit.length; i++) {
            System.out.print(" "+fahrenheit[i]);

        }
    }
}
