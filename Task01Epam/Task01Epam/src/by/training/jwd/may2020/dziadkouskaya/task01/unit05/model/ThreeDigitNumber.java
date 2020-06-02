package by.training.jwd.may2020.dziadkouskaya.task01.unit05.model;

public class ThreeDigitNumber {

	public static final int MULTIPLER_FOR_HUNDRETS_NUMBER = 100;
	public static final int MULTIPLER_FOR_TENS_NUMBER = 10;

	private int threeDigitNumber;

	private int hundredsNumber;

	private int tensNumber;

	private int unitsNumber;

	public ThreeDigitNumber() {

	}

	public ThreeDigitNumber(int threeDigitNumber) {

		this.threeDigitNumber = threeDigitNumber;
		this.hundredsNumber = threeDigitNumber / MULTIPLER_FOR_HUNDRETS_NUMBER;
		this.tensNumber = (threeDigitNumber - this.hundredsNumber * MULTIPLER_FOR_HUNDRETS_NUMBER)
				/ MULTIPLER_FOR_TENS_NUMBER;
		this.unitsNumber = (threeDigitNumber - this.hundredsNumber * MULTIPLER_FOR_HUNDRETS_NUMBER)
				% MULTIPLER_FOR_TENS_NUMBER;

	}

	public ThreeDigitNumber(int hundredsNumber, int tensNumber, int unitsNumber) {
		this.hundredsNumber = hundredsNumber;
		this.tensNumber = tensNumber;
		this.unitsNumber = unitsNumber;
		this.threeDigitNumber = hundredsNumber * MULTIPLER_FOR_HUNDRETS_NUMBER + tensNumber * MULTIPLER_FOR_TENS_NUMBER
				+ unitsNumber;

	}

	public int getThreeDigitNumber() {
		return threeDigitNumber;
	}

	public void setThreeDigitNumber(int threeDigitNumber) {
		this.threeDigitNumber = threeDigitNumber;
	}

	public int getHundredsNumber() {
		return hundredsNumber;
	}

	public int getTensNumber() {
		return tensNumber;
	}

	public int getUnitsNumber() {
		return unitsNumber;
	}

	@Override
	public String toString() {
		return "ThreeDigitNumber [threeDigitNumber=" + threeDigitNumber + "]";
	}

}
