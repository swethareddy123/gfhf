package calc;

import static org.junit.Assert.assertEquals;

import com.cg.Calculator;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefN {
	Calculator calc;
	int res;
	@Given("^User creates object of calculator$")
	public void user_creates_object_of_calculator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
	calc = new Calculator();
	}

	@When("^User pass (\\d+) and (\\d+) as input$")
	public void user_pass_and_as_input(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	res = calc.add(arg1, arg2);
	assertEquals(res,68);
	}

	@Then("^Displays sum of both numbers$")
	public void displays_sum_of_both_numbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("addition is :"+res);
	}



}
