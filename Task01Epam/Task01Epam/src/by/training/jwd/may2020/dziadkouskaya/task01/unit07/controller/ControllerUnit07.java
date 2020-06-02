package by.training.jwd.may2020.dziadkouskaya.task01.unit07.controller;

import by.training.jwd.may2020.dziadkouskaya.task01.unit07.model.InitialData;
import by.training.jwd.may2020.dziadkouskaya.task01.unit07.model.RealNumberOperations;
import by.training.jwd.may2020.dziadkouskaya.task01.unit07.view.ConsolePrinter;

/*
ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой част€х). 
ѕомен€ть местами дробную и целую части числа и вывести полученное значение числа.

ѕримечание: дл€ решени€ этой нельз€ использовать перевод числа в строку и обратно.
*/

public class ControllerUnit07 {
	public static void main(String[] args) {
		double number = InitialData.userInputDouble("Enter your number: ");
		
		double result = RealNumberOperations.createNewRealNumber(number);
		
		ConsolePrinter.print("New real number is " + result);
		
		
		
	}
	

}
