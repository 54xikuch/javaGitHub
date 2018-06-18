package com.miniCodingTest.testService;

import java.util.HashMap;
import java.util.Map;

import com.miniCodingTest.service.PrintFizzBuzz;

public class TestPrintFizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=========Begin test Stage One ============");
		PrintFizzBuzz printFizzBuzz = new PrintFizzBuzz(100);

		Map<Integer, String> instendMap = new HashMap<Integer, String>();
		instendMap.put(3, "Fizz");
		instendMap.put(5, "Buzz");
		
		printFizzBuzz.printStageOne(instendMap, false);
		System.out.println("=========End test Stage One ============");
		
		System.out.println("=========Begin test Stage Two ============");
		
		printFizzBuzz.printStageOne(instendMap, true);
		System.out.println("=========End test Stage Two ============");
	}

}
