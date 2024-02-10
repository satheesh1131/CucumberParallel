package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenQARegistrationPage {

	public OpenQARegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement firstNameInput;
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lastNameInput;
	@FindBy(xpath="//input[@id='userEmail']")
	private WebElement emailInput;
	@FindBy(xpath="//input[@id='dateOfBirthInput']")
	private WebElement dateOfBirthInput;
	@FindBy(xpath="//label[text()='Male']")
	private WebElement genderMaleButton;
	@FindBy(xpath="//label[text()='Sports']")
	private WebElement sportsCheckbox;
	@FindBy(xpath="//input[@id='userNumber']")
	private WebElement mobileNoInput;
	@FindBy(xpath="//input[@id='subjectsInput']")
	private WebElement subjectsInput;
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement addressInput;
	@FindBy(xpath="//img[@id='close_button_svg']")
	private WebElement closeAdsButton;
	@FindBy(xpath="//span[@id='survey_menu_report_ad_button_title']")
	private WebElement reportAdsButton;
	@FindBy(xpath="//iframe[@id='d10611f9']")
	private WebElement adsFrame;
	@FindBy(xpath="//input[@id='react-select-3-input']")
	private WebElement stateInput;
	@FindBy(xpath="//input[@id='react-select-4-input']")
	private WebElement cityInput;
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submitButton;
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement selectMonth;
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement selectYear;
	@FindBy(xpath="//div[text()='24']")
	private WebElement selectDate;
	@FindBy(xpath="//input[@id='uploadPicture']")
	private WebElement uploadFileInput;
	public WebElement getUploadFileInput() {
		return uploadFileInput;
	}
	public WebElement getSelectDate() {
		return selectDate;
	}
	public WebElement getSelectMonth() {
		return selectMonth;
	}
	public WebElement getSelectYear() {
		return selectYear;
	}
	public WebElement getStateInput() {
		return stateInput;
	}
	public WebElement getCityInput() {
		return cityInput;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getFirstNameInput() {
		return firstNameInput;
	}
	public WebElement getLastNameInput() {
		return lastNameInput;
	}
	public WebElement getEmailInput() {
		return emailInput;
	}
	public WebElement getDateOfBirthInput() {
		return dateOfBirthInput;
	}
	public WebElement getGenderMaleButton() {
		return genderMaleButton;
	}
	public WebElement getSportsCheckbox() {
		return sportsCheckbox;
	}
	public WebElement getMobileNoInput() {
		return mobileNoInput;
	}
	public WebElement getSubjectsInput() {
		return subjectsInput;
	}
	public WebElement getAddressInput() {
		return addressInput;
	}
	public WebElement getCloseAdsButton() {
		return closeAdsButton;
	}
	public WebElement getReportAdsButton() {
		return reportAdsButton;
	}
	public WebElement getAdsFrame() {
		return adsFrame;
	}

}
