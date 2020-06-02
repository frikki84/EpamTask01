package by.training.jwd.may2020.dziadkouskaya.task01.unit08.model;

import java.util.ArrayList;

public class FunctionSolution {
	public static final int CONST_FOR_FUNCTION = 2;
	
	public static int findDecisionInUsualConditions(int x) {
		return (x + CONST_FOR_FUNCTION) * 2;
	}

	public static int findDecisionInExceptionalConditions(int x) {
		return (x - CONST_FOR_FUNCTION) + 6;
	}

	public static ArrayList<Integer> findAllSolutionsOnTheLine(int start, int end, int step) {
		ArrayList<Integer> solutionList = new ArrayList<>();
		int result;
		
		for(int x = start; x <=end; x += step) {
			if (x != 15) {
				result = findDecisionInUsualConditions(x);
				solutionList.add(result);
				
			} else {
				result = findDecisionInExceptionalConditions(x); 
				solutionList.add(result);
			}
		}
			
		
		return solutionList;
	}

}
