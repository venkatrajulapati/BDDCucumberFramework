package stepDefinitions;

import com.app.libs.common.commonUtils;
import com.app.pages.HomePage;
import com.app.pages.SimpleFormDemoPage;
import com.app.testbase.testbase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class inputFormstest extends testbase {
	
	
		
	
	HomePage homePage = new HomePage();
	SimpleFormDemoPage simpleFormDemoPage = new SimpleFormDemoPage();
	
	@Given("Launch selenium easy Application")
	public void launch_selenium_easy_application() {
	    // Write code here that turns the phrase above into concrete actions
		homePage.openApplication();
	    
	}
	
	@Then("click on No thanks Button")
	public void click_on_no_thanks_button() {
	    // Write code here that turns the phrase above into concrete actions
		homePage.clickNoThanks();
	   System.out.println("click on no thanks");
	}

	@Then("Expand Input Forms from All Examples")
	public void expand_input_forms_from_all_examples() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Expanded inputforms");
	}

	@Then("select Simple from Demo")
	public void select_simple_from_demo() {
	    // Write code here that turns the phrase above into concrete actions
		
		homePage.selectsideMenuItem("Input Forms", "Simple Form Demo");
		
	}

	@When("Enter two Input Fields {string} and {string}")
	public void enter_two_input_fields(String a,String b) {
	    // Write code here that turns the phrase above into concrete actions
		
		 simpleFormDemoPage.enter_AandB_field_values("1", "2");
		
	}

	@Then("click on Get total")
	public void click_on_get_total() {
	    // Write code here that turns the phrase above into concrete actions
		
		simpleFormDemoPage.click_get_total_button();
		
	}

	@Then("verify the Total")
	public void verify_the_total() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("verify total");
	}

	@Then("close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
		System.out.println("close browser");
	}
	
	

}
