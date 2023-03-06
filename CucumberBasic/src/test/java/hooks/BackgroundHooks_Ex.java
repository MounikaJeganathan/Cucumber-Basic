package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BackgroundHooks_Ex {
	
	
	// first background hook will run then background will run and finally scenarios will run
	@Before
	public void beforeScenario() {
		System.out.println("BackGroundHooks!!! Before");
	}
	
	@After
	public void aftercenario() {
		System.out.println("BackGroundHooks!!! After");
	}
}
