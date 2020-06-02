package by.training.jwd.may2020.dziadkouskaya.task01.unit01.controller;

import by.training.jwd.may2020.dziadkouskaya.task01.unit01.model.InitialData;
import by.training.jwd.may2020.dziadkouskaya.task01.unit01.model.Logic;
import by.training.jwd.may2020.dziadkouskaya.task01.unit01.view.ConsolePrinter;

/*
¬ычислите значение выражени€ по формуле:
*/
public class ControllerUnit01 {
	public static void main(String[] args) {
		
		int a = InitialData.userInputInt("Enter a: ");
		int b = InitialData.userInputInt("Enter b: ");
		int c = InitialData.userInputInt("Enter c: ");
		
		String msg = Logic.findDecision(a, b, c);
		
		ConsolePrinter.print(msg);
			

	}

}
