package com.project.jbehave;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ChangeMachine {

	private final int [] coinTypes = {50, 25, 10, 5, 1};
	
	public List<Integer> getCoinsForChangeOf(double value) {
		if (value >= 1 || value <= 0) {
			throw new RuntimeException();
		}
		
		List<Integer> coins = new ArrayList<Integer>();
		
		BigDecimal valueChanged = new BigDecimal(String.valueOf(value));
		
		int ammountOfCents = valueChanged.multiply(BigDecimal.valueOf(100)).intValue();
		
		for (int coinType : coinTypes) {
			while (ammountOfCents >= coinType) {
				ammountOfCents -= coinType;
				coins.add(coinType);
			}
		}
		
		return coins;
	}
	
	public static void main(String[] args) {
		
	}
}
