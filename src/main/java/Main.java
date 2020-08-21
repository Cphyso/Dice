import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
		
		  System.out.println("Let's create a weighted Dice");
		  
//the elements within the array determine the weights on the sides of the dice. 
		  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");  
		  Die weightedDice = new Die(6,new int[] {1,1,1,1,1,5});
		  weightedDice.weightedSide = 3;
		  weightedDice.roll(); 
//changing the probability
		  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");  
		  weightedDice.setProbabilities(new int[] {1,2,3,4,5,6});
		  weightedDice.roll();
//creating a fair dice of any number of sides > 0 using factory class 
// a fair 6 sided dice
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");  
		DiceFactory diefactoryObject = new DiceFactory();
        Die die = diefactoryObject.makeDice(6);
        die.roll();
    }
}