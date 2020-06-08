
package by.epamtc.jwdmay2020.dziadkouskaya.task01.unit01;

/*
¬ычислите значение выражени€ по формуле:
*/
public class ControllerUnit01 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int c = 10;
		
		String msg = findDecision(a, b, c);
		System.out.println(msg);
			

	}
	
	
	public static String findDecision(int a, int b, int c) {
		String msg = "";

		double decicion = 0;

		double discriminantResult = Math.pow(b, 2) + 4 * a * c;
	

		if (discriminantResult < 0) {
			msg = "Equation has no solutions";
		} else {
			decicion = (b + Math.sqrt(discriminantResult)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
			msg = "Result is " + decicion;
		}

		return msg;

	}

	
}
