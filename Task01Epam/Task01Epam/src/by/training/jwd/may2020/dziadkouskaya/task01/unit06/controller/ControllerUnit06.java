package by.training.jwd.may2020.dziadkouskaya.task01.unit06.controller;

import by.training.jwd.may2020.dziadkouskaya.task01.unit06.model.ArithmeticProgressionOperations;
import by.training.jwd.may2020.dziadkouskaya.task01.unit06.model.InitialData;
import by.training.jwd.may2020.dziadkouskaya.task01.unit06.view.ConsolePrinter;

/*
����� ������ n ������ �������������� ���������� ����������� �� ������� Sn = ( a1 + an )* n / 2. 
���� a1 � d (��� �������������� ����������). 
������� n, ��� ������� �������� Sn ������� �� �������� ����� int � long (����������������� �����).
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
