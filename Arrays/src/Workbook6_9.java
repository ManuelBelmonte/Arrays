import java.util.Arrays;

public class Workbook6_9 {
    public static void main(String[] args) {
        //updating an array
        double[] num = {1.99,2.99,3.99,4.99};
        double[] tax = new double[4];

        for (int i = 0; i < num.length; i++) {
            tax[i] = (num[i]*.13) +num[i];
        }

        System.out.println(Arrays.toString(tax));

    }
}
