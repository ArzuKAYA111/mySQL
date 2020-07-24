package com.SQLhrms.testbase;

import com.SQLhrms.pages.AddEmployeePageElements;
import com.SQLhrms.pages.DashBoardPageElements;
import com.SQLhrms.pages.LoginPageElements;
import com.SQLhrms.pages.viewEmployeeListPageElements;

public class PageInitializer extends BaseClass {

	public static LoginPageElements login;
	public static DashBoardPageElements dashboard;
	public static AddEmployeePageElements addEmp;
	public static viewEmployeeListPageElements viewEmp;

	public static void initialize() {
		login = new LoginPageElements();
		dashboard = new DashBoardPageElements(); // we are calling the constructor of page calsses
		addEmp = new AddEmployeePageElements();
		viewEmp = new viewEmployeeListPageElements();

	}

}
