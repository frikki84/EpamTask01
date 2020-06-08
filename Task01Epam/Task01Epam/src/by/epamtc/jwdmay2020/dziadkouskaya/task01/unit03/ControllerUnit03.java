package by.epamtc.jwdmay2020.dziadkouskaya.task01.unit03;

/*
 Даны действительные числа а,b,с. 
 Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, 
 если это не так.
 */

public class ControllerUnit03 {
	public static void main(String[] args) {

		double a = 10;
		double b = 1;
		double c = -3;

		boolean condition = false;

		if ((a > b) && (b > c)) {

			condition = true;
		}

		if (condition) {
			a *= 2;
			b *= 2;
			c *= 2;

		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}

		System.out.println("a = " + a + ", b = " + b + ", c = " + c);

	}

}
