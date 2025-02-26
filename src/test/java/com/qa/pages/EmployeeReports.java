package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ElementActions;

import cucumber.api.Scenario;

public class EmployeeReports {
	WebDriver driver;

	@FindBy(xpath = "//span[text()='PIM']")

	WebElement pimPageLink;

	@FindBy(xpath = "//h6[@name='PIM']")

	WebElement pimPageTitle;

	@FindBy(xpath = "//a[text()='EmployeeReports']")

	WebElement ReportPageLink;

	@FindBy(xpath = "//button[text()=' Add ']")

	WebElement addReportsButton;

	@FindBy(xpath = "//label[text()='Report Name']/following::input[@class='oxd-input oxd-input--active']")

	WebElement reportsNamefield;
	@FindBy(xpath = "//label[text()='Select Display Field Group']/following::div[5]/child::i")

	WebElement displayFieldGroupdropdownArrow;

	@FindBy(xpath = "//label[text()='Select Display Field']/following::div[5]/child::i")

	WebElement displayFielddropdownArrow;

	@FindBy(xpath = "//label[text()='Select Display Field Group']/following::button[@class='oxd-icon-button orangehrm-report-icon']")

	WebElement addempFieldButton;

	@FindBy(xpath = "//button[text()=' Save ']")

	WebElement saveReportsButton;

	@FindBy(xpath = "//label[text()='Report Name']/following::input[1]")

	WebElement SearchReportNameField;

	@FindBy(xpath = "//button[text()=' Search ']")

	WebElement SearchReportButton;

	@FindBy(xpath = "//i[@class='oxd-icon bi-file-text-fill']")

	WebElement generateReportButton;

	public EmployeeReports(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
		
		public String navigateToReportsPage(Scenario scenario) {

			 

			ElementActions.clickElement(driver, ReportPageLink, scenario);

	 

			return ElementActions.getText(driver, ReportPageLink, scenario);

		}

	}
