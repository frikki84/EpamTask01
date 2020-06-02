package by.training.jwd.may2020.dziadkouskaya.task01.unit02.model.entities;

public enum Months {
	JANUARY("01", "January", 31), FEBRUARY("02", "February", 28), MARCH("03", "March", 31), APRIL("04", "April", 30),
	MAY("05", "May", 31), JUNE("06", "June", 30), JULY("07", "July", 31), AUGUST("08", "August", 31),
	SEPTEMBER("09", "September", 30), OCTOBER("10", "October", 30), NOVEMBER("11", "November", 31),
	DECEMBER("12", "December", 31);

	private String monthOrder;
	private String monthName;
	private int daysAmount;

	private Months(String monthOrder, String monthName, int daysAmount) {
		this.monthOrder = monthOrder;
		this.monthName = monthName;
		this.daysAmount = daysAmount;

	}

	public String getMonthOrder() {
		return monthOrder;
	}

	public String getMonthName() {
		return monthName;
	}

	public int getDaysAmount() {
		return daysAmount;
	}

}
