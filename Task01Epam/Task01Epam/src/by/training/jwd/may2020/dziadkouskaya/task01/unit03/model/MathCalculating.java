package by.training.jwd.may2020.dziadkouskaya.task01.unit03.model;

public class MathCalculating {
	public static boolean checkCondition(NumbersStore numbers) {
		boolean result = false;

		if (numbers.getA() > numbers.getB() && numbers.getB() > numbers.getC()) {
			result = true;
		}

		return result;
	}

	public static NumbersStore findResult(NumbersStore numbers) {
		boolean condition = MathCalculating.checkCondition(numbers);

		if (condition) {
			numbers.setA(numbers.getA() * 2);
			numbers.setB(numbers.getB() * 2);
			numbers.setC(numbers.getC() * 2);
			
		}else {
			numbers.setA(Math.abs(numbers.getA()));
			numbers.setB(Math.abs(numbers.getB()));
			numbers.setC(Math.abs(numbers.getC()));
		}
		
		return numbers;
	}

}
