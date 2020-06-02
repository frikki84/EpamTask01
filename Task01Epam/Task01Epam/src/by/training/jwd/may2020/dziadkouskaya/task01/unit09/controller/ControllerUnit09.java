package by.training.jwd.may2020.dziadkouskaya.task01.unit09.controller;

import by.training.jwd.may2020.dziadkouskaya.task01.unit09.view.ConsolePrinter;
import by.training.jwd.may2020.dziadkouskaya.task01.unit09.model.InitialData;
import by.training.jwd.may2020.dziadkouskaya.task01.unit09.model.NumbersValidation;
import by.training.jwd.may2020.dziadkouskaya.task01.unit09.model.Solution;

/*
Вычислить: (1+2) * (1+2+3) * ... * (1+2+...+10).
*/
public class ControllerUnit09 {
	public static void main(String[] args) {

		int start = InitialData.userInputInt("Enter the first number: ");
		start = NumbersValidation.checkStart(start);
		
		int end = InitialData.userInputInt("Enter the last number: ");
		end = NumbersValidation.checkEnd(start, end);

		long result = Solution.findSolution(start, end);
		
		ConsolePrinter.print("The result is " + result);

	}
}
