package by.training.jwd.may2020.dziadkouskaya.task01.unit08.controller;

import java.util.ArrayList;

import by.training.jwd.may2020.dziadkouskaya.task01.unit08.view.ConsolePrinter;
import by.training.jwd.may2020.dziadkouskaya.task01.unit08.model.FunctionSolution;
import by.training.jwd.may2020.dziadkouskaya.task01.unit08.model.InitialData;
import by.training.jwd.may2020.dziadkouskaya.task01.unit08.model.LineValidation;

/*
Вычислить значения функции на отрезке [a,b] c шагом h:



x = 15 y(x) = (x + c)*2
x != 15  y(x) = (x - c) + 6

*/
public class ControllerUnit08 {
	public static void main(String[] args) {
		int start = InitialData.userInputInt("Enter the start of the line: ");
		int end = InitialData.userInputInt("Enter the end of the line: ");
		int step =InitialData.userInputInt("Enter the step: ");

		end = LineValidation.checkLineStartEnd(start, end);
		step = LineValidation.checkStep(start, end, step);
		
		ArrayList<Integer> arrayList = FunctionSolution.findAllSolutionsOnTheLine(start, end, step);		
		
		ConsolePrinter.print("The results of the function on the line is:\n" + arrayList);
		
		
		
		
	}

}
