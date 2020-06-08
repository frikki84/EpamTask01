package by.epamtc.jwdmay2020.dziadkouskaya.task01.unit04;


/*
Вычислить значение функции:

*/
public class ControllerUnit04 {
	
	public static void main(String[] args) {
		double x = -2;
		
		boolean condition = false;

		if (x <= 13) {
			condition = true;
		}

		double result = 0;

		if (condition) {
			result = Math.pow(x, 3) + 9;
		} else {
			result = -1 * (3/(x + 1));
		}


		System.out.println("Thr result is " + result);
	}

}
