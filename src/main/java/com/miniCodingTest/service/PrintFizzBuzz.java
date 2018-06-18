package com.miniCodingTest.service;

import java.util.Map;
import java.util.Map.Entry;

public class PrintFizzBuzz {
	private Integer max;
	
	public PrintFizzBuzz(Integer max) {
		this.max = max;
	}
	
	

	/**
	 * description:
	 * (1)multiples of 3[can change]: print 'Fizz'[can change];
	 * (2)multiples of 5[can change]: print 'Buzz'[can change];
	 * (3)multiples of both 3 and 5: print 'FizzBuzz'[can change]; 
	 * 
	 * params: 
	 * 	insteadMap: contain number and the instead of String;
	 *  inFlag: if the numbe contain 3 or 5 print 'Fizz' or 'Buzz';
	 */
	public void printStageOne(Map<Integer, String> insteadMap, boolean inFlag) {
		Integer number = null;
		
		for (Integer i=0; i < max; i++) {
			number = i+1;
			//
			if (null != insteadMap && insteadMap.size() > 0) {
				Integer tempNumber = null;
				String tempStr = null;
				StringBuffer printStr = new StringBuffer("");
				int instendCount = 0;
				
				for (Entry<Integer, String> mapEntry: insteadMap.entrySet()) {
					tempNumber = mapEntry.getKey();
					tempStr = mapEntry.getValue();
					
					if (null != tempNumber && tempNumber !=0) {
						if (false == inFlag && 0 == number%tempNumber) {
							printStr.append(tempStr);
							instendCount ++;
						} else if (true == inFlag && 
								(0 == number%tempNumber || String.valueOf(number).indexOf(String.valueOf(tempNumber))>-1)) {
							printStr.append(tempStr);
							instendCount ++;
						} 
					}
				}
				
				//
				if (instendCount >0) {
					System.out.println(printStr);
					continue;
				}
			}
			System.out.println(number);	
		}
	}



	public Integer getMax() {
		return max;
	}



	public void setMax(Integer max) {
		this.max = max;
	}

	
}
	
