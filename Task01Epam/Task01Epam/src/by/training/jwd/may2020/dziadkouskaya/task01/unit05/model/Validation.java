package by.training.jwd.may2020.dziadkouskaya.task01.unit05.model;

public class Validation {
	public static final int MIN_TREE_DIGIT_NUMBER = 100;
	public static final int MAX_TREE_DIGIT_NUMBER = 999;
	
	public static int checkTreeDigitNumber(int number) {
		while (number < MIN_TREE_DIGIT_NUMBER || number > MAX_TREE_DIGIT_NUMBER) {
			String msg = "Error!!! Please, enter tree-digit number (number between " + MIN_TREE_DIGIT_NUMBER + 
					" and " + MAX_TREE_DIGIT_NUMBER + "): ";
			number = InitialData.userInputInt(msg);
		}
		
		
		return number;
	}
	

}
