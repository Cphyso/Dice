
public class DiceFactory {
	//factory class can produce fair dice of different sides
	public Die makeDice(int numberOfSides) {
		//produce a fair dice with the same number of sides passed in the parameter
		int [] fairness = new int[numberOfSides];
		Die newDice = new Die();
		newDice.sides = numberOfSides;
			for(int i = 0; i < numberOfSides; i++) {
				fairness[i] = 1;
			}
			
		newDice.setProbabilities(fairness);
		return newDice;
	}
}
