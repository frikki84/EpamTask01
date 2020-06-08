package by.epamtc.jwdmay2020.dziadkouskaya.task01.unit07;

/*
���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������). 
�������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.

����������: ��� ������� ���� ������ ������������ ������� ����� � ������ � �������.
*/

public class ControllerUnit07 {
	public static void main(String[] args) {
		double number = 456.111;
		
		double result = createNewRealNumber(number);
		
		System.out.println("New real number is " + result);
		
		
	}


	public static int findIntegerPartOfRealNumber(double number) {

		return (int) number;
	}

	public static int findFractionalPartOfRealNumber(double number) {

		return (int) (number * 1000  - (int) number * 1000 );

	}
	
	public static double createNewRealNumber(double number) {
		int digitPart = findIntegerPartOfRealNumber(number);
		int fractionalPart = findFractionalPartOfRealNumber(number);
		
		double result = fractionalPart + (double)digitPart/1000;
		
		return result;
	}

	
	

}
