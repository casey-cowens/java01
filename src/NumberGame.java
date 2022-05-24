import java.util.Scanner;
import java.util.Random;


public class NumberGame {

    public static void main(String[] arg) {

        System.out.print("Enter number 1-10:");
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int upperbound = 10;
        int a = input.nextInt();
        int b = rand.nextInt(upperbound);
        if (a == b) {

            System.out.println(a + " " + b + " " + "You win!");

        } else {
            System.out.println(a + " " + b + " " + "You lose");
        }
    }
}





