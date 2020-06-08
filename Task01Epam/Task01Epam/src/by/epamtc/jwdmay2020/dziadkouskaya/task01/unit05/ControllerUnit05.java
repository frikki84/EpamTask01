package by.epamtc.jwdmay2020.dziadkouskaya.task01.unit05;

/*
Дано трехзначное число. Определите:

сумму и произведение цифр числа;
число, полученное перестановкой цифр сотен и десятков;
четырехзначное число, полученное приписыванием цифры единиц в качестве цифры тысяч 
(например, из числа 137 необходимо получить число 7137).
Примечание: для решения этой нельзя использовать перевод числа в строку и обратно.

*/
public class ControllerUnit05 {

	public static void main(String[] args) {
		int number = 123;

		int sum = findSumOfDigitsOfNumber(number);

		int multiplication = findMultiplicationOfDigitsOfNumber(number);

		int numberChangeHundredsAndTens = findNewNumberByChangingHundredsAndTens(number);

		int fourDigitNumber = findFourDigitNumberWithUnitsNumberAsNumberOfThousands(number);

		System.out.println("Summ is " + sum + "\nMultiplication is " + multiplication + "\nNew number is "
				+ numberChangeHundredsAndTens + "\nFourDigitNumber is " + fourDigitNumber);

	}

	public static int findSumOfDigitsOfNumber(int threeDigitNumber) {
		int hundredsNumber = threeDigitNumber / 100;

		int tensNumber = (threeDigitNumber - hundredsNumber * 100) / 10;

		int unitsNumber = (threeDigitNumber - hundredsNumber * 100) % 10;

		return hundredsNumber + tensNumber + unitsNumber;
	}

	public static int findMultiplicationOfDigitsOfNumber(int threeDigitNumber) {
		int hundredsNumber = threeDigitNumber / 100;

		int tensNumber = (threeDigitNumber - hundredsNumber * 100) / 10;

		int unitsNumber = (threeDigitNumber - hundredsNumber * 100) % 10;

		return hundredsNumber * tensNumber * unitsNumber;

	}

	public static int findNewNumberByChangingHundredsAndTens(int threeDigitNumber) {
		int hundredsNumber = threeDigitNumber / 100;

		int tensNumber = (threeDigitNumber - hundredsNumber * 100) / 10;

		int unitsNumber = (threeDigitNumber - hundredsNumber * 100) % 10;

		return 100 * tensNumber + 10 * hundredsNumber + unitsNumber;
	}

	public static int findFourDigitNumberWithUnitsNumberAsNumberOfThousands(int threeDigitNumber) {
		int hundredsNumber = threeDigitNumber / 100;

		int tensNumber = (threeDigitNumber - hundredsNumber * 100) / 10;

		int unitsNumber = threeDigitNumber % 10;
		
		return unitsNumber * 1000 + threeDigitNumber;

	}

}
