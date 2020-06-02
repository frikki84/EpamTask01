package by.training.jwd.may2020.dziadkouskaya.task01.unit06.controller;

import by.training.jwd.may2020.dziadkouskaya.task01.unit06.model.ArithmeticProgressionOperations;
import by.training.jwd.may2020.dziadkouskaya.task01.unit06.model.InitialData;
import by.training.jwd.may2020.dziadkouskaya.task01.unit06.view.ConsolePrinter;

/*
Сумма первых n членов арифметической прогрессии вычисляется по формуле Sn = ( a1 + an )* n / 2. 
Даны a1 и d (шаг арифметической прогрессии). 
Найдите n, при котором значение Sn выходит за диапазон типов int и long (экспериментальным путем).
*/

public class ControllerUnit06 {

	public static void main(String[] args) {
		int a = InitialData.userInputInt("Enter the first member of an arithmetic progression: ");
		int d = InitialData.userInputInt("Enter the step of an arithmetic progression: ");

		int nOutOfInt = ArithmeticProgressionOperations.findArithmeticProgressionSumOutOfInt(a, d);
		double nOutOgLong = ArithmeticProgressionOperations.findArithmeticProgressionSumOutOfLong(a, d);

		ConsolePrinter.print("The step at which the amount goes beyond INT is " + nOutOfInt
				+ "\nThe step at which the amount goes beyond LONG is " + nOutOgLong);

	}
}
