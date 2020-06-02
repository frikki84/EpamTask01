package by.training.jwd.may2020.dziadkouskaya.task01.unit02.model.entities;

public class UserDate {
	public static final int MIN_DAY_AMOUNT = 0;
	public static final int MAX_DAY_AMOUNT = 31;
	
	private int day;
	private Months monthFromEnum;

	public UserDate() {

	}

	public UserDate(int day, Months monthFromEnum) {
		this.day = day;
		this.monthFromEnum = monthFromEnum;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day > MIN_DAY_AMOUNT && day <=MAX_DAY_AMOUNT) {
			this.day = day;
		}
	}

	public Months getMonthFromEnum() {
		return monthFromEnum;
	}

	public void setMonthFromEnum(Months monthFromEnum) {
		this.monthFromEnum = monthFromEnum;
	}

	@Override
	public String toString() {
		return "UserDate [day=" + day + ", monthName=" + monthFromEnum.getMonthName() + "]";
	}

}
