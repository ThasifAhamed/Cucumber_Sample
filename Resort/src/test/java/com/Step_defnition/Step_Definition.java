
//Step 3: We create snippet methods by select all steps in feature file and right click->run as->Cucumber feature
//Step 4: In Step_Defnition 1st paste the snippet methods from feature file then extends Base_Class and bring what POM we want as object 
package com.Step_defnition;

import com.POM.Login_page;
import com.helpers.File_Reader_Manager;

import Base.Base_Class;
import io.cucumber.java.en.*;

public class Step_Definition extends Base_Class // this extends will come from base_class 
{
     Login_page l = new Login_page(driver);//this object will come from POM 

     @Given ("User navigate into URL")
     public void user_navigate_into_url() throws Throwable {
         url(File_Reader_Manager.getInstance().getInstanceCR().getUrl());//this URL is coming from base class
     }
     @Then("max the window")
     public void max_window() {
         wondow_max();
     }
     
	@Then("User enter his username {string}")
     public void user_enter_his_username(String username) {
         Sendkeys(l.getUsername(), username);//l.getUsername() l is the name changed from Login_page it comes from Login_page POM
     }

     @Then("User enter his password {string}")
     public void user_enter_his_password(String password) {
         Sendkeys(l.getPassword(), password);
     }

     @And("User click login button")
     public void user_click_login_button() {
         click(l.getLogin_button());
     }
}
