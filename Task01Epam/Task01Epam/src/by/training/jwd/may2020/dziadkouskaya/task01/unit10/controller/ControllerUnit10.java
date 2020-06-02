package by.training.jwd.may2020.dziadkouskaya.task01.unit10.controller;

import by.training.jwd.may2020.dziadkouskaya.task01.unit10.view.ConsolePrinter;
import by.training.jwd.may2020.dziadkouskaya.task01.unit10.model.InitialData;
import by.training.jwd.may2020.dziadkouskaya.task01.unit10.model.ProgressionAnalysis;

/*
�������� ���������, ������� ��� ��������� ������������������ ����� ��������� ����� 
(������� ��������� ����� - ���� 0, ���������� ����� �� ������ 2) ����������:
�������� �� ������������������ ������������;

���� �� � ��� ���� �� ���� ���� ���������� �������� �����;

�������� �� ������������������ ����������������� (3, -2, 4, -5, 0 - ��; 5, -4, -7, 8, 0 - ���); 
��� ����� �������� � ���������� ����� �������������� ������� Scanner.
*����������: ������ ��� ��������� ��� ������� ���� ������ ������������ ������.
*/
public class ControllerUnit10 {
	public static void main(String[] args) {
		boolean increasingProgression = true;
		boolean sameNumbers = false;
		boolean changeSign = true;

		int number = InitialData.userInputInt("Enter first number: ");

		int nextNumber = InitialData.userInputInt("Enter next number: ");

		while (nextNumber != 0) {

			increasingProgression = ProgressionAnalysis.checkIncreasingProgression(number, nextNumber, increasingProgression);

			sameNumbers = ProgressionAnalysis.checkSameNumbers(number, nextNumber, sameNumbers);

			changeSign = ProgressionAnalysis.checkSignChange(number, nextNumber, changeSign);

			number = nextNumber;
			nextNumber = InitialData.userInputInt("Enter next number: ");

		}

		String msgIncreasing = "The progression is not increasing";
		String msgSameNumbers = "The progression doesn't have the same number's pair";
		String msgSignChange = "The progression is not alternating";

		if (increasingProgression) {
			msgIncreasing = "The progression is increasing";
		}
		if (sameNumbers) {
			msgSameNumbers = "The progression has the same number's pair";
		}
		if (changeSign) {
			msgSignChange = "The progression is alternating";
		}
		
		ConsolePrinter.print(msgIncreasing + "\n" + msgSameNumbers + "\n" + msgSignChange); 

	}

}
