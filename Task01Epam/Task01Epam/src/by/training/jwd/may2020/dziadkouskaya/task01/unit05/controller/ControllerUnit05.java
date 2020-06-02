package by.training.jwd.may2020.dziadkouskaya.task01.unit05.controller;

import by.training.jwd.may2020.dziadkouskaya.task01.unit05.model.Validation;
import by.training.jwd.may2020.dziadkouskaya.task01.unit05.view.ConsolePrinter;
import by.training.jwd.may2020.dziadkouskaya.task01.unit05.model.InitialData;
import by.training.jwd.may2020.dziadkouskaya.task01.unit05.model.NumberOperations;
import by.training.jwd.may2020.dziadkouskaya.task01.unit05.model.ThreeDigitNumber;



/*���� ����������� �����. ����������:

����� � ������������ ���� �����;
�����, ���������� ������������� ���� ����� � ��������;
�������������� �����, ���������� ������������� ����� ������ � �������� ����� ����� 
(��������, �� ����� 137 ���������� �������� ����� 7137).
����������: ��� ������� ���� ������ ������������ ������� ����� � ������ � �������.
*/
public class ControllerUnit05 {
	public static void main(String[] args) {
		int number = InitialData.userInputInt("Please, enter three-digit number: ");
		
		number = Validation.checkTreeDigitNumber(number);
		
		ThreeDigitNumber threeDigitNumber = new ThreeDigitNumber(number);
		
		int sum = NumberOperations.findSumOfDigitsOfNumber(threeDigitNumber);
		ConsolePrinter.print("The sum is " + sum);
		
		int multiplication = NumberOperations.findMultiplicationOfDigitsOfNumber(threeDigitNumber);
		ConsolePrinter.print("The multiplication is " + multiplication);
		
		int numberChangeHundredsAndTens = NumberOperations.findNewNumberByChangingHundredsAndTens(threeDigitNumber);
		ConsolePrinter.print("The new number is " + numberChangeHundredsAndTens);
		
		int fourDigitNumber = NumberOperations.findFourDigitNumberWithUnitsNumberAsNumberOfThousands(threeDigitNumber);
		ConsolePrinter.print("New four-digit number is " + fourDigitNumber);
		
		
		
		
		
	}

}
