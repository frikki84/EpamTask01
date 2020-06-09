package by.epamtc.jwdmay2020.dziadkouskaya.task01.unit02;

public class UserDate {

	private int date;
	private int month;
	private String monthName;

	public UserDate() {

	}

	public UserDate(int date, int month) {
		this.date = date;
		this.month = month;

		switch (month) {
		case 1:
			this.monthName = "January";
			break;
		case 2:
			this.monthName = "February";
			break;
		case 3:
			this.monthName = "March";
			break;
		case 4:
			this.monthName = "April";
			break;
		case 5:
			this.monthName = "May";
			break;
		case 6:
			this.monthName = "June";
			break;
		case 7:
			this.monthName = "July";
			break;
		case 8:
			this.monthName = "August";
			break;
		case 9:
			this.monthName = "September";
			break;
		case 10:
			this.monthName = "October";
			break;
		case 11:
			this.monthName = "November";
			break;
		case 12:
			this.monthName = "December";
			break;
		}

	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getMonthName() {
		return monthName;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	@Override
	public String toString() {
		return "UserDate [date=" + date + ", month=" + month + ", monthName=" + monthName + "]";
	}

}
