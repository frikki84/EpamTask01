package by.training.jwd.may2020.dziadkouskaya.task01.unit04.controller;

import by.training.jwd.may2020.dziadkouskaya.task01.unit04.view.ConsolePrinter;
import by.training.jwd.may2020.dziadkouskaya.task01.unit04.model.FunctionCalculating;
import by.training.jwd.may2020.dziadkouskaya.task01.unit04.model.InitialData;

/*
Вычислить значение функции:

*/
public class ControllerUnit04 {
	
	public static void main(String[] args) {
		double x = InitialData.userInputDouble("Enter your number: ");
		
		double result = FunctionCalculating.calculateFunction(x);
		
		ConsolePrinter.printDoubleValuesWith4DecimalPlaces("Function value is ", result);
		
		
	}

}
