import java.security.SecureRandom;

public class MethodsAndArrays02 {
	public static void main(String[] args) {
		//SecureRandom generateRandom = new SecureRandom();
		//int die1=0;
		//int die2 = 0;
		//int dice = 0;
		
		//generate a number between 2 and 12.
		//a coin likes a two-side die.
		//die1 = generateRandom.nextInt(6) + 1;
		//die2 = generateRandom.nextInt(6) + 1;
		
		//dice = die1+die2;
		//System.out.println(dice);
		System.out.println(rollDice(2,6));
	}
	
	public static int rollDice(int numDice, int numSides) {
		//empty signature here first.
		SecureRandom generateRandom = new SecureRandom();
		int result = 0;
		//numDice produces an array 
		//int[] dice = new int[numDice];
		
		//numSides produces a for-loop
		for(int index=0; index<numDice-1;index++){
			//dice[index] = generateRandom.nextInt(numSides)+1;
			result+=generateRandom.nextInt(numSides)+1;
		}
		
		return result;
		//should assign a result variable first.
	}
}
