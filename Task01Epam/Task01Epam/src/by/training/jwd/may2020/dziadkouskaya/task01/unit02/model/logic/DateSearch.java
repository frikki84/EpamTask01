package by.training.jwd.may2020.dziadkouskaya.task01.unit02.model.logic;

import by.training.jwd.may2020.dziadkouskaya.task01.unit02.model.entities.Months;
import by.training.jwd.may2020.dziadkouskaya.task01.unit02.model.entities.UserDate;

public class DateSearch {

	public static UserDate searchDate(int number) {
		UserDate date = new UserDate();

		int result = number;

		for (Months month : Months.values()) {

			if (result < month.getDaysAmount()) {
				date.setDay(result);
				date.setMonthFromEnum(month);
				break;

			} else {
				result -= month.getDaysAmount();
			}

		}

		return date;
	}

}
