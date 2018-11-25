package com.camp.story.stepdefinitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

import com.camp.story.BuyerSteps;
import com.camp.story.screenplay.tasks.ResearchItem;
import com.camp.story.screenplay.tasks.Start;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SomethinTodoStepDefinitions 
{
	@Steps
    BuyerSteps buyer;
	
	/* @Before
	 public void set_the_stage() 
	 {
	    OnStage.setTheStage(new OnlineCast());
	 }*/
	
	Actor james = Actor.named("James");
	
	@Managed private WebDriver hisBrowser;
	
	@Given("I need to something")
	public void givenMethod()
	{
		
	}
	
	@When("I add the todo action something")
	public void whenMethod()
	{
		
	}
	
	@Then("something should be recorded in my todo list")
	public void thenMethod()
	{
		
	}
	
	
	@Given("I want to buy $article")
    public void buyerWantsToBuy(String article) {
    	
    	System.out.println("success ==============================================");
    	
        buyer.opens_etsy_home_page();
        
        System.out.println("success ==============================================");
      
    }

    @When("I search for items containing $keyword")
    public void searchByKeyword(String keyword) {
        buyer.searches_for_items_containing(keyword);
    
    }

    @Then("I should only see items related to $keyword")
    public void resultsForACategoryAndKeywordInARegion(String keyword) {
        buyer.should_see_items_related_to(keyword);
        
    }
	
    
    @Given("打开百度网页")
    public void open_home_page()
    {
    	/*james.can(BrowseTheWeb.with(hisBrowser));
    	james.wasAbleTo(Start.withDefault());*/
    	
    	OnStage.setTheStage(new OnlineCast());
    	theActorCalled("james").attemptsTo(Start.withDefault());
    }
    
    @When("搜索关键字 $keyword")
    public void research_keyword(String keyword)
    {
    	theActorCalled("james").attemptsTo(ResearchItem.called(keyword));
    }
    
    @Then("搜索结果内容包括 $keyword")
    public void check_research_result(String keyword)
    {
    	//buyer.should_see_items_related_to(keyword);
    }

}
