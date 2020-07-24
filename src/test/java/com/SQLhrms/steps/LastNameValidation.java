package com.SQLhrms.steps;

import org.junit.Assert;

import com.SQLhrms.Utils.CommonMethods;

import io.cucumber.java.en.Then;

public class LastNameValidation extends CommonMethods{
	@Then("get last name from table")
	public void get_last_name_from_table() {
		viewEmp. getLastNameFromTable(); 
		
	}


	@Then("validate last name from ui against db")
	public void validate_last_name_from_ui_against_db() {
	   
		 Assert.assertEquals(DBSteps.dbData,viewEmp.getLastNameFromTable());	
		
		
	}



}
