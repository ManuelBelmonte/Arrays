public class Workbook6_3 {
    public static void main(String[] args) {
        //econtrar el producto que buscan
        String [] grocery = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("Do you sell cofe?");

        for(int i = 0; i < grocery.length; i++){
            if(grocery[i].equals("coffee")){
                System.out.println("\n We have in aisle "+i);
                break;
            }
        }
    }
}
