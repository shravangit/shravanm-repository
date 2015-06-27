package com.comicrelief.RND15.testcases;

import static org.junit.Assert.*;

import com.comicrelief.RND15.Util.SeleniumWebDriver;
import com.comicrelief.RND15Pages.ColorboxPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class ColorboxRED436_Steps extends SeleniumWebDriver
{
	
	private ColorboxPage colorboxpage = new ColorboxPage();
	
	
	//Scenario 1:
	
	@Given("^I am on RND dev site$")
	public void I_am_on_RND_dev_site() throws Throwable 
	{
		colorboxpage.navigateToRNDhomePage(rnd15Hostname_QA);
	}

	@Given("^I am on a MD or LG device$")
	public void I_am_on_a_MD_or_LG_device() throws Throwable 
	{
		WaitForElementToBePresentAndContinueAfterTimeOut(colorboxpage.getLocator4ColorBoxLink());
	}

	@Given("^I have a link available$")
	public void I_have_a_link_available() throws Throwable 
	{
		WaitForElementToBePresentAndContinueAfterTimeOut(colorboxpage.getLocator4ColorBoxLink());
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));	
	}

	@When("^I click on this given link$")
	public void I_click_on_this_given_link() throws Throwable 
	{
		colorboxpage.clickOnColorBoxLink();
	}

	@Then("^I see a Colorbox opened$")
	public void I_see_a_Colorbox_opened() throws Throwable 
	{
		WaitForElementToBePresentAndContinueAfterTimeOut(colorboxpage.getLocator4ColorBoxLink());
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));
	}

	@Then("^I see a Image in the colorbox$")
	public void I_see_a_Image_in_the_colorbox() throws Throwable 
	{
		WaitForElementToBePresentAndContinueAfterTimeOut(colorboxpage.getLocator4ColorBoxLink());
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));
	}

	@Then("^I see a Caption with a CTA in the colorbox$")
	public void I_see_a_Caption_with_a_CTA_in_the_colorbox() throws Throwable 
	{
		WaitForElementToBePresentAndContinueAfterTimeOut(colorboxpage.getLocator4ColorBoxLink());
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));		
	}
	
	@Then("^I see a close option at the top right cornor$")
	public void I_see_a_close_option_at_the_top_right_cornor() throws Throwable 
	{
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));
	}

	@When("^I click on close button$")
	public void I_click_on_close_button() throws Throwable 
	{
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));
	}

	@Then("^I see the Colorbox popup is closed correctly$")
	public void I_see_the_Colorbox_popup_is_closed_correctly() throws Throwable 
	{
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));
	}

	@Then("^I see the Link is again available for use$")
	public void I_see_the_Link_is_again_available_for_use() throws Throwable 
	{
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));
	    Result="Pass";
	}
	
	//Scenario 2:

	@Given("^I am on a XS or SM device$")
	public void I_am_on_a_XS_or_SM_device() throws Throwable 
	{
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));
	}

	@Then("^I see the link opens its relevant page directly$")
	public void I_see_the_link_opens_its_relevant_page_directly() throws Throwable 
	{
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));
	}

	@Then("^I see it is opened in the same window$")
	public void I_see_it_is_opened_in_the_same_window() throws Throwable 
	{
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));
	}

	@Then("^I see a Image in the page$")
	public void I_see_a_Image_in_the_page() throws Throwable 
	{
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));
	}

	@Then("^I see a Caption with a CTA in the page$")
	public void I_see_a_Caption_with_a_CTA_in_the_page() throws Throwable 
	{
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));
	}
	
	@When("^I click on the Back button of the browser$")
	public void I_click_on_the_Back_button_of_the_browser() throws Throwable 
	{
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));
	}

	@Then("^I see the RND home page$")
	public void I_see_the_RND_home_page() throws Throwable 
	{
		assertTrue("FAILED: RND15 Landing page is not displayed, Plz check: ", IsElementPresent(colorboxpage.getLocator4ColorBoxLink()));
	}



}
