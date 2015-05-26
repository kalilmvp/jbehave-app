package com.project.jbehave;

import java.util.ArrayList;
import java.util.List;

public class ChangeMachine {

	public List<Integer> getCoinsForChangeOf(double value) {
		List<Integer> coins = new ArrayList<Integer>();
		
		coins.add((int)(value * 100));
		
		return coins;
	}
}
