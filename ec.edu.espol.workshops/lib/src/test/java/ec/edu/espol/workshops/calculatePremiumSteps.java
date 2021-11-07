package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
public class calculatePremiumSteps {
	
	
	public Boolean license_status_approved = true;
	public Customer customer = new Customer(23,"M",true, true);
	public CarInsurance carInsurance = new CarInsurance();
	
	@Given("Customer has no license")
	public void customer_has_no_license() {
		customer.setDrivingLicense(false);
	}
	
	@When("Validating data entry")
	public void validating_data_entry() {
		CarInsurance.validarPremium(customer);
	}
	@Then("Deny insurance")
	public void deny_insurance(){
		assertTrue(customer.hasDrivingLicense() == license_status_approved);
	}
}