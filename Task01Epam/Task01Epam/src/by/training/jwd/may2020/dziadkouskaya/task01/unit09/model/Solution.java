package by.training.jwd.may2020.dziadkouskaya.task01.unit09.model;

public class Solution {
	public static long findSolution(int start, int end) {
		long result = 1;
		int counter =start;
		for (int i = start + 1; i <= end; i ++) {
			counter += i;
			result *= counter;
		}
		
		return result;
		
	}

}
