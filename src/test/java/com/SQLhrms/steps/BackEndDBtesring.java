package com.SQLhrms.steps;
import java.util.List;
import org.openqa.selenium.WebElement;
import com.SQLhrms.Utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackEndDBtesring extends CommonMethods {
	String dbName;

	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
		login.login("Admin", "Hum@nhrm123");
	}

	@And("user naviagtes to Employee List Page")
	public void user_naviagtes_to_Employee_List_Page() {
		click(dashboard.PIM);
		click(dashboard.empListPage);
	}

	@When("user search employee by valid id {string}")
	public void user_search_employee_by_valid_id(String string) {
		sendText(viewEmp.EmpID, string);
		jsClick(viewEmp.serchBtn);
	}

//@And("user retrieves employee last name from DataBase with {string}")
//	public void user_retrieves_employee_last_name_from_DataBase_with(String string) {
//		JDBCUtil.DBConnection();
//		Map<String, String> dBnames = JDBCUtil.SingleDBDataMap(string);		
//		if(dBnames.containsKey("emp_firstname")) {
//			dbName = dBnames.get("emp_firstname");
//		}else if(dBnames.containsKey("emp_lastname")) {
//			dbName = dBnames.get("emp_lastname");
//		}		DBUtils.closeConnection();
	//}
//	@Then("User will be able to validate employee lastname {string} against DataBase entry accordingly")
//	public void user__validates_employee_lastname_against_DataBase_entry_accordingly(String string) {	
	// String expectedName = string;
//		String UIText=null;		
//		List<WebElement> UISearchResult = empList.resultTableData;	
//		for (WebElement ele : UISearchResult) {
//			 UIText = ele.getText();
////			 System.out.println("from UI ="+UIText);		
	// if (UIText.contains(expectedName)) {
//				UIText=UIText.replaceAll("\\s.*", "").trim();
////				System.out.println("from UI Only 1 name ="+UIText);
//				break;
//			}else {
//				UIText=expectedName;
//			}	
	//}
//		System.out.println("from UI afterloop ="+UIText);
//		Assert.assertEquals("UI & DB Data NOT Matched", dbName, UIText);
}
