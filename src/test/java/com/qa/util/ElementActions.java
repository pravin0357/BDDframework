package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;

/**
 * @author Asus
 * This method will take element as parametere and wait for explcit wait time and perform click action
 */
/**
 * @author Asus
 *
 */
public class ElementActions {
	
	//this method will clear the existing data from filed 
	
	public static void clearFieldvalue(WebDriver driver, WebElement elem, Scenario scenario) {

		 

		try {

			WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_CLICKABLE, scenario);

		} catch (Exception E) {

			scenario.write(" Error while waiting for clicking on Emmenet ");

		}

		try {

			elem.clear();

		} catch (Exception E) {

			scenario.write(" Error on clicking the element after wating !");

		}

 

	}
	
	
public static void clickElement(WebDriver driver, WebElement elem, Scenario scenario) {

 

		

		try {

			WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_CLICKABLE, scenario);

		}

		catch (Exception E)

		{

			scenario.write(" Error while waiting for clicking on Emmenet ");

		}

		try{

			elem.click();

		}

		catch (Exception E){

			scenario.write(" Error on clicking the element after wating !");

		}
                
		
	}
       //
   
    public static void sendKeys(WebDriver driver, WebElement elem, Scenario scenario, String texttoType) {

	 

	try {

		WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_CLICKABLE, scenario);

	} catch (Exception E) {

		scenario.write(" Error while waiting for clicking on Emmenet ");

	}



	try {

		elem.sendKeys(texttoType);

	} catch (Exception E) {

		scenario.write(" Error on typeing the text in element after wating !");

	}

}
/**
 * @param driver
 * @param elem
 * @param scenario This method will wait for fluent wait and when element is visisble 
 * get the text and return  the string value
 * @return
 */
public static String getText(WebDriver driver, WebElement elem, Scenario scenario) {

	 

	String texttoReturn = null;

	try {

		WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_VISIBLE, scenario);

	} catch (Exception E) {

		scenario.write(" Error while waiting for clicking on Emmenet ");

	}

	try {

		texttoReturn = elem.getText();

	} catch (Exception E) {

		scenario.write(" Error on fetching  the text in element after wating !");

	}

	return texttoReturn;



}
/**
 * @param driver
 * @param elem
 * @param scenario
 * @param option
 *  This method accept as option parameter and select the value from parametere
 */
public static void selectOptionFromDropDown(WebDriver driver, WebElement elem, Scenario scenario, String option) {

	 

	try {

		WaitMethods.waitFor(driver, elem, WaitMethods.ELEMENT_TO_BE_CLICKABLE, scenario);

	} catch (Exception E) {

		scenario.write(" Error while waiting for Element to be clickable   ");

	}



	Select objselect = new Select(elem);



	try {

		objselect.selectByValue(option);

	} catch (Exception E) {

		scenario.write(" Error while selecting the option from Dropdown! ");



	}
}
}
