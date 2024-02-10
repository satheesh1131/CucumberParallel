package com.stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.Select;

import com.page.objects.PageObjectManager;
import com.resources.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenQAStepDef extends BaseClass{
	PageObjectManager pom;
	XSSFWorkbook wb;
	XSSFRow row;
	Robot r;
	@Given("User go to openQA registration page")
	public void userGoToOpenQARegistrationPage() throws Exception {
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\dell\\OneDrive\\Documents\\WorkBook\\openQA.xlsx"));
		wb=new XSSFWorkbook(fis);
		row = wb.getSheetAt(0).getRow(0);
		loadUrl(row.getCell(0).getStringCellValue());	    
	}
	@When("User enter firstname and lastname")
	public void userEnterFirstnameAndLastname() {
		sendText(pom.getOpenQARegistrationPage().getFirstNameInput(),row.getCell(1).getStringCellValue());
	    sendText(pom.getOpenQARegistrationPage().getLastNameInput(), row.getCell(2).getStringCellValue());
	}
	@When("User enter email address")
	public void userEnterEmailAddress() {
		sendText(pom.getOpenQARegistrationPage().getEmailInput(), row.getCell(3).getStringCellValue());
	}
	@When("User chooses gender")
	public void userChoosesGender() {
		jsScrollByElement(pom.getOpenQARegistrationPage().getGenderMaleButton());
		click(pom.getOpenQARegistrationPage().getGenderMaleButton());	    
	}
	@When("User enter mobile number")
	public void userEnterMobileNumber() {
		String mobileNum = new DataFormatter().formatCellValue(row.getCell(7));
		sendText(pom.getOpenQARegistrationPage().getMobileNoInput(),mobileNum);	    
	}
	@When("User enter date of birth")
	public void userEnterDateOfBirth() {
		click(pom.getOpenQARegistrationPage().getDateOfBirthInput());
		new Select(pom.getOpenQARegistrationPage().getSelectMonth()).selectByVisibleText(row.getCell(4).getStringCellValue());
		new Select(pom.getOpenQARegistrationPage().getSelectYear()).selectByVisibleText(row.getCell(5).getStringCellValue());
		click(pom.getOpenQARegistrationPage().getSelectDate());
	}
	@When("User enters subjects")
	public void userEntersSubjects() throws AWTException {
		sendText(pom.getOpenQARegistrationPage().getSubjectsInput(), row.getCell(10).getStringCellValue());	 
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	@When("User chooses hobbies")
	public void userChoosesHobbies() {
		click(pom.getOpenQARegistrationPage().getSportsCheckbox());	    
	}
	@When("User uploads picture")
	public void userUploadsPicture() {
		sendText(pom.getOpenQARegistrationPage().getUploadFileInput(),row.getCell(11).getStringCellValue());
	}
	@When("User enter communication address")
	public void userEnterCommunicationAddress() {
		sendText(pom.getOpenQARegistrationPage().getAddressInput(),row.getCell(6).getStringCellValue());	    
	}
	@Then("User select state")
	public void userSelectState() throws AWTException {
		sendText(pom.getOpenQARegistrationPage().getStateInput(), row.getCell(8).getStringCellValue());
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	@Then("User select city")
	public void userSelectCity() throws AWTException {
		sendText(pom.getOpenQARegistrationPage().getCityInput(), row.getCell(9).getStringCellValue());
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	@Then("User click submit button")
	public void userClickSubmitButton() throws IOException {
		jsClickElement(pom.getOpenQARegistrationPage().getSubmitButton());	 
	    wb.close();
	}
	@Given("User opens browser")
	public void userOpensBrowser() {
	   openBrowser("chrome");
	   pom=new PageObjectManager(getDriver());
	}
	@Then("User closes the browser")
	public void userClosesTheBrowser() {
	   closeBrowser();
	}



}
