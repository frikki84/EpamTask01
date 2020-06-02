package by.training.jwd.may2020.dziadkouskaya.task01.unit08.model;

import by.training.jwd.may2020.dziadkouskaya.task01.unit02.model.logic.InitialData;

public class LineValidation {
	public static int checkLineStartEnd(int start, int end) {
		while (start >= end) {
			String msg = "Error!!! Please, enter the endpoint bigger than the start point: ";
			end = InitialData.userInputInt(msg);
		}
		return end;

	}
	
	public static int checkStep(int start, int end, int step) {
		while (step > (end - start)) {
			String msg = "Error!!! Please, enter the step less than line : ";
			step = InitialData.userInputInt(msg);
			
		}
		return step;
	}
}
