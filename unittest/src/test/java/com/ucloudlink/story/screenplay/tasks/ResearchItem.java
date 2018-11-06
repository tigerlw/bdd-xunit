package com.ucloudlink.story.screenplay.tasks;


import static org.openqa.selenium.Keys.RETURN;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class ResearchItem {
	
	  public static Target WHAT_NEEDS_TO_BE_DONE = Target.the("'What needs to be done?' field").locatedBy("#kw");
	
	  public static Task called(String thingToDo) {
	        return Task.where("{0} adds a todo item called: #thingToDo",
	                Enter.theValue(thingToDo)
	                        .into(WHAT_NEEDS_TO_BE_DONE)
	                        .thenHit(RETURN)
	                ).with("thingsToDo").of(thingToDo);
	    }

}
