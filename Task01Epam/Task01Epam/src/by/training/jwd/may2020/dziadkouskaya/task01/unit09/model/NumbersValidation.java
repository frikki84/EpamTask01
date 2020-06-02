package by.training.jwd.may2020.dziadkouskaya.task01.unit09.model;

public class NumbersValidation {
	public static int checkStart(int start) {
		while (start < 0) {
			start = InitialData.userInputInt("The first number can't be less than 1. Please enter another number: ");
		}
		
		return start;
	}
	
	public static int checkEnd(int start, int end) {
		while (start >= end) {
			end = InitialData.userInputInt("The second number must be less than the first. Please enter another number: ");
		}
		
		return end;
		
	}
	/*
	 * public static long checkSolution(long result, int start, int end) { while
	 * (result <= 0) { end = InitialData.
	 * userInputInt("The result is too big for this application. Please, change the second number: "
	 * ); result = Solution.findSolution(start, end); }
	 * 
	 * return result; }
	 */
}
