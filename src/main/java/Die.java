/**
 * Author: Sifiso Mhlongo
 * 
 * 
 * */

import java.util.Arrays;
import java.util.Random;

public class Die {
	public  DiceFactory diefactoryObject;
	
// constructors
	public Die(int sideNumber, int [] probabilities) throws Exception {
		this.sides = sideNumber;
		this.probabilities = probabilities;
		if(probabilities.length != sides) {
			throw new Exception("The array length must be equal to the number of sides of the dice");
		}else if(checkForNegatives()){
			throw new Exception("negative probabilities not allowed");
		}else if(!checkProbabilitiesSum()) {
			throw new Exception("probability sum must be greater than 0");
		}
	}
	//constructor for creating dice of any number > than 0 making use of the factory class
	public Die(DiceFactory diefactoryObject) {
		this.diefactoryObject = diefactoryObject;
	}
	public Die() {}
	
	// this method checks that there aren't any negative numbers in the array
	public boolean checkForNegatives() {
		boolean containsNegative;
			String probabilitiesToString = Arrays.toString(probabilities);
			containsNegative = probabilitiesToString.matches(".*-\\d.*");
		return containsNegative;
	}
	// this methods checks that the sum of integers in the array is > 0
	public boolean checkProbabilitiesSum() {
		int sum = 0;
		for(int x:probabilities) {
			sum+=x;
		}
		boolean isSumGreaterThanZero = sum > 0;
		return isSumGreaterThanZero;
	}
	
	private int [] probabilities;
    int sides;													//number of sides on the dice
    int weight;													//degree of probability of one side
    int weightedSide;											//specific side that weight is applied

    public void setProbabilities(int[] diceProbabilities) {
        this.probabilities = diceProbabilities;
    }
    public int getProbabilities() {
    	int upperBound = 0;
        for(int i = 0; i < sides;i++){
            upperBound += probabilities[i];
        }
        return upperBound;
    }

    public void roll() {
    	
        Random random = new Random();
        int value = random.nextInt(getProbabilities());

            if(value>sides){
                System.out.println(weightedSide);
            }else{
                System.out.println(value);
            }
    }
	/*
	 * public static void main(String[] args) throws Exception {
	 * 
	 * System.out.println("Let's create a weighted Dice"); //the elements within the
	 * array determine the weights on the sides of the dice. Die weightedDice = new
	 * Die(6,new int[] {1,1,1,1,1,5}); weightedDice.weightedSide = 3;
	 * weightedDice.roll(); //changing the probability
	 * weightedDice.setProbabilities(new int[] {1,2,3,4,5,6}); weightedDice.roll();
	 * //creating a fair dice of any number of sides > 0 using factory class // a
	 * fair 6 sided dice die = diefactoryObject.makeDice(6); }
	 */
}