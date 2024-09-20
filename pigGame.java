/**
 *  This program defines the Dice class. A Dice is 6 sides by default, but can
 *  be overridden as n-sided. It keeps track of the number of rolls and
 *  the last roll value.
 *
 *  @author Neha Bayyapu 
 *  @date September 20th 2024
 *  @version 2.0
 */

public class pigGame {
	private int sides, rollcount, value;
	/**	Print the introduction to the game */
	
	public static void main(String[]args) {
		//Prompt.getChar();
		int score=0;
		int compScore=0;
		int totalScore=0;
		int compTotal=0;
		System.out.println("\n");
		System.out.println("______ _         _____");
		System.out.println("| ___ (_)       |  __ \\");
		System.out.println("| |_/ /_  __ _  | |  \\/ __ _ _ __ ___   ___");
		System.out.println("|  __/| |/ _` | | | __ / _` | '_ ` _ \\ / _ \\");
		System.out.println("| |   | | (_| | | |_\\ \\ (_| | | | | | |  __/");
		System.out.println("\\_|   |_|\\__, |  \\____/\\__,_|_| |_| |_|\\___|");
		System.out.println("          __/ |");
		System.out.println("         |___/");
		System.out.println("\nThe Pig Game is human vs computer. Each takes a"
							+ " turn rolling a die and the first to score");
		System.out.println("100 points wins. A player can either ROLL or "
							+ "HOLD. A turn works this way:");
		System.out.println("\n\tROLL:\t2 through 6: add points to turn total, "
							+ "player's turn continues");
		System.out.println("\t\t1: player loses turn");
		System.out.println("\tHOLD:\tturn total is added to player's score, "
							+ "turn goes to other player");
		System.out.println("\n");
		while(score>=100,compScore>=100){
		System.out.println("**** USER Turn ***"){
		System.out.println("Your turn score:    " + turnScore);
		System.out.println("Your total score:    " + totalScore);
		rollHold = Prompt.getChar("(r)oll or (h)old ->");
		if(rollHold.equals('r'){
			System.our.println("You ROLL");
			printDice();
			if(getValue() == 1){
				turnScore = 0;
				totalScore = 0;
				System.out.println("Your turn score:  " + turnScore);
				System.out.println("Your total score:  " + totalScore);
			}
			else {
				turnScore = getValue();
				totalScore += turnScore;
				System.out.println("Your turn score:  " + turnScore);
				System.out.println("Your total score:  " + totalScore);
			}
		}
		else if (rollHold.equals('h'){
		System.out.println("Your total score:  " + totalScore);	
		}
			
		}
		System.out.println("**** COMPUTER Turn ***"){
		System.out.println("Computer's turn score:    " + compScore);
		System.out.println("Computer's total score:    " + compTotal);

		
			System.our.println("Computer will ROLL");
			printDice();
			if(getValue() == 1){
				compScore = 0;
				compTotal = 0;
				System.out.println("Computer's turn score:  " + turnScore);
				System.out.println("Computer's total score:  " + totalScore);
			}
			else {
				turnScore = getValue();
				totalScore += turnScore;
				System.out.println("Computer's turn score:  " + turnScore);
				System.out.println("Computer's total score:  " + totalScore);
			}
			while(compTotal<= 20){
				System.our.println("Computer will ROLL");
			printDice();
			if(getValue() == 1){
				compScore = 0;
				compTotal = 0;
				System.out.println("Computer's turn score:  " + turnScore);
				System.out.println("Computer's total score:  " + totalScore);
			}
			else {
				turnScore = getValue();
				totalScore += turnScore;
				System.out.println("Computer's turn score:  " + turnScore);
				System.out.println("Computer's total score:  " + totalScore);
			}
			System.out.println("Computer will HOLD");
			System.out.println("Computer's total score:  "+ compTotal);
			}
		
			
		}
		
		
		
	}
	if(totalScore>= 100){
		System.out.println("Your turn score:   " + turnScore);
		System.out.println("Your total score:  " + totalScore);
		System.out.println("Congratulations!!! YOU WON!!!!");
		System.out.println("Thanks for playing the pig Game!!!!");
		
	}
	else {
		System.out.println("Computer's turn score:   " + turnScore);
		System.out.println("Computer;s total score:  " + totalScore);
		System.out.println("UNFORTUNATELY, YOU LOST");
		System.out.println("Thanks for playing the pig Game!!!!");
	}
	
	
	/* Create the seven different line images of a die */
	private String [] line = {
						" _______ ",
						"|       |",
						"| O   O |",
						"|   O   |",
						"|     O |",
						"| O     |",
						"|_______|" };
	
	/**	Constructor for Dice with s sides */
	public pigGame (int s) {
		sides = s;
		rollcount = value = 0;
	}
	
	/**	Constructor for default Dice with 6 sides */
	public pigGame ( ) {
		this(6);
	}
	
	/**	@return		the rolled value */
	public int roll ( ) {
		rollcount++;
		value = (int)(Math.random() * sides) + 1;
		return value;
	}
	
	/**	@return		number of rolls so far */
	public int numRolls ( ) {
		return rollcount;
	}
	
	/**	@return		the value on the dice */
	public int getValue ( ) {
		return value;
	}
	
	/**
	 *  Prints out the images of the dice
	 */
	public void printDice() {		
		/* Print each line */
		for (int i = 0; i < 6; i++) {
			System.out.print(" ");
			printDiceLine(getValue() + 6 * i);
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 *  @param value The index into the ASCII dice image
	 */
	private void printDiceLine(int value) {
		System.out.print(line[getDiceLine(value)]);
	}
	
	/**
	 *  @param value The value of the die print line
	 *  @return  The index into the ASCII dice image
	 */
	private int getDiceLine(int value) {
		if (value < 7) return 0;
		if (value < 14) return 1;
		switch (value) {
			case 20: case 22: case 25:
				return 1;
			case 16: case 17: case 18: case 24: case 28: case 29: case 30:
				return 2;
			case 19: case 21: case 23:
				return 3;
			case 14: case 15:
				return 4;
			case 26: case 27:
				return 5;
			default:	// value > 30
				return 6;
		}
	}
}





