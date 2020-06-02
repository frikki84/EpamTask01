package by.training.jwd.may2020.dziadkouskaya.task01.unit02.controller;

import by.training.jwd.may2020.dziadkouskaya.task01.unit02.model.entities.UserDate;
import by.training.jwd.may2020.dziadkouskaya.task01.unit02.model.logic.DateSearch;
import by.training.jwd.may2020.dziadkouskaya.task01.unit02.model.logic.InitialData;

import by.training.jwd.may2020.dziadkouskaya.task01.unit02.model.logic.Validation;
import by.training.jwd.may2020.dziadkouskaya.task01.unit02.view.ConsolePrinter;

/*Вычислите число и месяц в невисокосном году по номеру дня.
 * 
 */

public class ControllerUnit02 {
	public static void main(String[] args) {
		int dayNumber = InitialData.userInputInt("Enter your number, please: ");

		dayNumber = Validation.checkDayNumber(dayNumber);

		UserDate userDate = DateSearch.searchDate(dayNumber);

		ConsolePrinter.print(
				"Your date is The " + userDate.getDay() + " of " + userDate.getMonthFromEnum().getMonthName());

	}

}
