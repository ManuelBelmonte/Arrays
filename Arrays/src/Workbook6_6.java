public class Workbook6_6 {
    public static void main(String[] args) {
        int randomNumbers [] = {randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),
                randomNumber(),randomNumber(),randomNumber(),randomNumber()};

        int score = 0;
        int seat = 0;
        System.out.print("Here are you scores: ");

        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(" "+randomNumbers[i]);
            if (randomNumbers[i] > score) {
                score = randomNumbers[i];
                seat = i;

            }
        }
        System.out.println("\nThe highest score is: "+score+" give that man a cookie");
        System.out.println("It's the gentleman in seat: " + seat + ". Give that man a cookie!");


    }

    public static int randomNumber (){
        double random = Math.random() *4999;
        random+=1;
        return (int) random;
    }
    }

