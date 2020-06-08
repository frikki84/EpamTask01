package by.epamtc.jwdmay2020.dziadkouskaya.task01.unit09;

/*
Вычислить: (1+2) * (1+2+3) * ... * (1+2+...+10).
*/
public class ControllerUnit09 {
	public static void main(String[] args) {

		int start = 1;
		int end = 10;

		long result = 1;

		int counter = start;
		for (int i = start + 1; i <= end; i++) {
			counter += i;
			result *= counter;
		}

		System.out.println(result);

	}
}
