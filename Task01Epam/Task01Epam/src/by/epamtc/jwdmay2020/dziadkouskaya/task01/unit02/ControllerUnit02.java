package by.epamtc.jwdmay2020.dziadkouskaya.task01.unit02;

/*Вычислите число и месяц в невисокосном году по номеру дня.
 * 
 */

public class ControllerUnit02 {
	public static void main(String[] args) {
		int dayNumber = 244;

		UserDate userDate = searchDate(dayNumber);

		System.out.println(userDate.getDate() + " of " + userDate.getMonthName());

	}

	public static UserDate searchDate(int number) {
		int date = 0;
		int month = 0;
		UserDate userDate = null;

		//January
			if (number <= 31 && number > 0) {
				date = number;
				month = 1;
				return userDate = new UserDate(date, month);
			}
			number -= 31;
		//February	
			if (number <= 28 && number > 0) {
				date = number;
				month = 2;
				return userDate = new UserDate(date, month);
			}
			
			number -= 28;
			

			//March - June
		for (int i = 3; i <= 6; i += 2) {
			if (number <= 31 && number > 0) {
				date = number;
				month = i;
				return userDate = new UserDate(date, month);
			}
			number -= 31;
			
			if (number <= 30 && number > 0) {
				date = number;
				month = i + 1;
				return userDate = new UserDate(date, month);
			}
			number -= 30;
						
		}
		
		//July
		if (number <= 31 && number > 0) {
			date = number;
			month = 7;
			return userDate = new UserDate(date, month);
		}
		number -= 31;
		
		//August - December
		for (int i = 8; i <= 12; i += 2) {
			if (number <= 31 && number > 0) {
				date = number;
				month = i;
				return userDate = new UserDate(date, month);
			}
			number -= 31;
		
			if (number <= 30 && number > 0) {
				date = number;
				month = i + 1;
				return userDate = new UserDate(date, month);
			}
			number -= 30;
			
		}

		return userDate;
	}

}
