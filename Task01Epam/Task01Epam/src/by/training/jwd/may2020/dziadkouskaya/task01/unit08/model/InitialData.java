package by.training.jwd.may2020.dziadkouskaya.task01.unit08.model;

import java.util.Scanner;

public class InitialData {
	private static Scanner scanner = new Scanner(System.in);

	public static int userInputInt(String msg) {
		System.out.print(msg);
		return scanner.nextInt();

	}
	
	public static double userInputDouble(String msg) {
		System.out.print(msg);
		return scanner.nextDouble();

	}

}
