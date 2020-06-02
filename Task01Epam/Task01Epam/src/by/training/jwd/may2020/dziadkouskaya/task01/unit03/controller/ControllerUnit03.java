package by.training.jwd.may2020.dziadkouskaya.task01.unit03.controller;

import by.training.jwd.may2020.dziadkouskaya.task01.unit02.view.ConsolePrinter;
import by.training.jwd.may2020.dziadkouskaya.task01.unit03.model.InitialData;
import by.training.jwd.may2020.dziadkouskaya.task01.unit03.model.MathCalculating;
import by.training.jwd.may2020.dziadkouskaya.task01.unit03.model.NumbersStore;

/*
 Даны действительные числа а,b,с. 
 Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, 
 если это не так.
 */

public class ControllerUnit03 {
	public static void main(String[] args) {

		String msg = "Enter the number ";
		double a = InitialData.userInputDouble(msg + "a: ");
		double b = InitialData.userInputDouble(msg + "b: ");
		double c = InitialData.userInputDouble(msg + "c: ");
		
		NumbersStore numbers = new NumbersStore(a, b, c);
		numbers = MathCalculating.findResult(numbers);
		
		ConsolePrinter.print("Your numbers are: a = " + numbers.getA() + ", b = " + numbers.getB() + ", c = " + numbers.getC());
		
		
		

	}
}
