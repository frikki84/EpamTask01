package by.training.jwd.may2020.dziadkouskaya.task01.unit02.model.logic;

public class Validation {
	public static final int MIN_NUMBER_OF_DAY = 1;
	public static final int MAX_NUMBER_OF_DAY = 365;

	public static int checkDayNumber(int dayNumber) {
		while (dayNumber < MIN_NUMBER_OF_DAY || dayNumber > MAX_NUMBER_OF_DAY) {
			String msg = "Error!!! Please, enter the number between " + MIN_NUMBER_OF_DAY + 
					" and " + MAX_NUMBER_OF_DAY + ": ";
			dayNumber = InitialData.userInputInt(msg);
		}

		return dayNumber;
	}

}
