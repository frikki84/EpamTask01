package by.epamtc.jwdmay2020.dziadkouskaya.task01.unit08;

/*
Вычислить значения функции на отрезке [a,b] c шагом h:



x = 15 y(x) = (x + c)*2
x != 15  y(x) = (x - c) + 6

*/
public class ControllerUnit08 {
	public static void main(String[] args) {
		int startA = 8;
		int endB = 45;
		int stepH = 7;
		int functionConst = 2;

		int result;

		for (int x = startA; x <= endB; x += stepH) {
			if (x != 15) {
				result = findDecisionInUsualConditions(x, functionConst);
				System.out.println(result);
				

			} else {
				result = findDecisionInExceptionalConditions(x, functionConst);
				System.out.println(result);
			

			}

		}
	}

	public static int findDecisionInUsualConditions(int x, int functionConst) {
		return (x + functionConst) * 2;
	}

	public static int findDecisionInExceptionalConditions(int x, int functionConst) {
		return (x - functionConst) + 6;
	}

}
