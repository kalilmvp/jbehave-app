package com.project.jbehave;

import static org.junit.Assert.*;

import java.util.List;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class FindChangesSteps {
	
	private ChangeMachine changeMachine = null;
	private List<Integer> change = null;
	Exception exception = null;
	
	@Given("a change machine")
	public void creteChangeMachine() {
		//inicializacao dos objetos
		this.changeMachine = new ChangeMachine();
		change = null;
		exception = null;
	}
	
	@When("i ask for a change of <value>")
	@Alias("i ask for a change of $value")
	public void changeFor(@Named("value") double value) {
		try {
			this.change = this.changeMachine.getCoinsForChangeOf(value);
		} catch (Exception e) {
			exception = e;
		}
	}
	
	@Then("it returns the <coin> coin")
	@Alias("it returns the $coin coin")
	public void changeCoins(@Named("coin") String coins) {
		assertEquals(this.change.get(0) + "c", coins);
	}
	
	@Then("it will raise an error")
	public void raiseError() {
		assertNotNull(exception);
	}
}