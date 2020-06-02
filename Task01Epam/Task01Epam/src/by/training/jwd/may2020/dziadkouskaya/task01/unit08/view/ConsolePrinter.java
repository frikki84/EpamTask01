package by.training.jwd.may2020.dziadkouskaya.task01.unit08.view;

public class ConsolePrinter {
	
	public static void print(String msg) {
		
		System.out.println(msg);
	}
	
	public static void printDoubleValuesWith4DecimalPlaces(String msg, double value) {
		System.out.printf(msg + "%.4f", value);
		
	}

}

