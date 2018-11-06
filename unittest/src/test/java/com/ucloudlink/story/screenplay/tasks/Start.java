package com.ucloudlink.story.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.ucloudlink.story.pages.HomePage;

public class Start implements Task
{
	private HomePage homePage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(homePage));
	}
	
	public static Start withDefault()
	{
		return instrumented(Start.class);
	}
	
	
	public Start()
	{
		
	}

}
