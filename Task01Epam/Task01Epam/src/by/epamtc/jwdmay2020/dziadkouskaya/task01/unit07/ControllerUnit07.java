package by.epamtc.jwdmay2020.dziadkouskaya.task01.unit07;

/*
ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой част€х). 
ѕомен€ть местами дробную и целую части числа и вывести полученное значение числа.

ѕримечание: дл€ решени€ этой нельз€ использовать перевод числа в строку и обратно.
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
