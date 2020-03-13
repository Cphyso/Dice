import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's create a weighted Dice");

        System.out.println("Enter weight for number 6");
        Scanner wei = new Scanner(System.in);
        int weightOnSide = wei.nextInt();
        Die d = new Die();
        d.weight = weightOnSide;

        for (int j = 0; j < 30; j++) {
            d.roll();
        }
    }
}