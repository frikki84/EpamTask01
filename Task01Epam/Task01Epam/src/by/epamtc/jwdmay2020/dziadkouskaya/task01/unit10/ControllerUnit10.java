package by.epamtc.jwdmay2020.dziadkouskaya.task01.unit10;

import java.util.Scanner;

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
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean increasingProgression = true;
		boolean sameNumbers = false;
		boolean changeSign = true;

		int number = userInputInt("Enter first number: ");

		int nextNumber = userInputInt("Enter next number: ");

		while (nextNumber != 0) {

			increasingProgression = checkIncreasingProgression(number, nextNumber, increasingProgression);

			sameNumbers = checkSameNumbers(number, nextNumber, sameNumbers);

			changeSign = checkSignChange(number, nextNumber, changeSign);

			number = nextNumber;
			nextNumber = userInputInt("Enter next number: ");

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

		System.out.println(msgIncreasing + "\n" + msgSameNumbers + "\n" + msgSignChange);

	}

	public static int userInputInt(String msg) {
		System.out.print(msg);
		return scanner.nextInt();

	}

	public static boolean checkIncreasingProgression(int number, int nextNumber, boolean increasingProgression) {

		if (number > nextNumber) {

			increasingProgression = false;
		}
		return increasingProgression;

	}

	public static boolean checkSameNumbers(int number, int nextNumber, boolean sameNumbers) {
		if (number == nextNumber) {

			sameNumbers = true;
		}

		return sameNumbers;

	}

	public static boolean checkSignChange(int number, int nextNumber, boolean changeSign) {

		if (number * nextNumber > 0) {

			changeSign = false;
		}
		return changeSign;

	}

}
