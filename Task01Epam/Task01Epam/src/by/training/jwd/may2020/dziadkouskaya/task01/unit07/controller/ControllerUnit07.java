package by.training.jwd.may2020.dziadkouskaya.task01.unit07.controller;

import by.training.jwd.may2020.dziadkouskaya.task01.unit07.model.InitialData;
import by.training.jwd.may2020.dziadkouskaya.task01.unit07.model.RealNumberOperations;
import by.training.jwd.may2020.dziadkouskaya.task01.unit07.view.ConsolePrinter;

/*
���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������). 
�������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.

����������: ��� ������� ���� ������ ������������ ������� ����� � ������ � �������.
*/

public class ControllerUnit07 {
	public static void main(String[] args) {
		double number = InitialData.userInputDouble("Enter your number: ");
		
		double result = RealNumberOperations.createNewRealNumber(number);
		
		ConsolePrinter.print("New real number is " + result);
		
		
		
	}
	

}
