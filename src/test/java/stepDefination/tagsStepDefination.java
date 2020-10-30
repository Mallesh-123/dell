package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class tagsStepDefination {
	@Given("^Executing Scenario_one$")
	public void executing_Scenario_one() throws Throwable {
	    System.out.println("scenario 1 executed");
	}

	@Given("^Executing Scenario_two$")
	public void executing_Scenario_two() throws Throwable {
		System.out.println("scenario 2 executed");
	}

	@Given("^Executing Scenario_three$")
	public void executing_Scenario_three() throws Throwable {
		System.out.println("scenario 3 executed");
	}

	@Given("^Executing Scenario_four$")
	public void executing_Scenario_four() throws Throwable {
		System.out.println("scenario 4 executed");
	}

}
