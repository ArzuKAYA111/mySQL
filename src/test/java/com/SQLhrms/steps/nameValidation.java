package com.SQLhrms.steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.SQLhrms.Utils.CommonMethods;
import com.SQLhrms.Utils.ConfigsReader;
import com.SQLhrms.Utils.GlobalVariables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class nameValidation extends CommonMethods{
	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
	  sendText(login.username, ConfigsReader.getProperty("username"));
	  sendText(login.password, ConfigsReader.getProperty("password"));
	  click(login.loginBtn);
	}
	
	@Given("user navigate to employee list page")
	public void user_navigate_to_employee_list_page() {
		jsClick(dashboard.PIM);
		jsClick(dashboard.empListPage);
	}

	
	//for  SQL Name validation against DB
			@Given("admin searches employee by ID {string}")
			public void admin_searches_employee_by_ID(String string) {
				viewEmp.EmpID.sendKeys(string,Keys.ENTER);
				GlobalVariables.empID=string;
				
				wait(3);
				
				jsClick(viewEmp.serchBtn);
			}
	
			//for  SQL Name validation against DB
			@When("verify table is displayed")
			public void verify_table_is_displayed() {
			    Assert.assertEquals(true, viewEmp.isTableDisplayed());
			}
			//for  SQL Name validation against DB
			@Then("get first name from table")
			public void get_first_name_from_table() {
			  System.out.println(viewEmp.getFirstNameFromTable());  
				
			}
			
			//for  SQL Name validation against DB
			@Then("validate first name from ui against db")
			public void validate_first_name_from_ui_against_db() {
			   Assert.assertEquals(DBSteps.dbData,viewEmp.getFirstNameFromTable());
			}

	
	
	
	
	
	
	
}
