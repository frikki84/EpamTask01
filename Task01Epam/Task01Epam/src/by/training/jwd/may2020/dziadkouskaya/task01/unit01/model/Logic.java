package by.training.jwd.may2020.dziadkouskaya.task01.unit01.model;

public class Logic {

	public static String findDecision(double a, double b, double c) {
		String msg = "";

		double decicion = 0;

		double discriminantResult = Math.pow(b, 2) + 4 * a * c;
	

		if (discriminantResult < 0) {
			msg = "Equation has no solutions";
		} else {
			decicion = (b + Math.sqrt(discriminantResult)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
			msg = "Result is " + decicion;
		}

		return msg;

	}

}
