package StepDefinitions;

import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.ToDoMVCPages;

public class ToDoMVCSteps {
	
	WebDriver driver = null;
	
	@Before
	public void browser_setup() {
	    String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver");
	    driver = new ChromeDriver();
	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	@Given("I am in to do mvc page")
	public void i_am_in_to_do_mvc_page() {
	    driver.navigate().to("https://todomvc.com/examples/vue/");
	}

	@When("I enter a (.*)$")
	public void i_enter_a_keyword(String enter_todo) throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		todo.enter_to_do(enter_todo);
	}

	@Then("I see (.*) in the mvc list$")
	public void i_see_word_in_the_mvc_list(String enter_todo) throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		List<WebElement> ele = driver.findElements(todo.list_value);
	    for(int i = 0; i < ele.size(); i++) {
	    	if (ele.get(i).getText().equals(enter_todo)) {
	    		System.out.println("The To Do task " +enter_todo +" is listed in the MVC page");
	    		break;
	    	}
	    }
	}
	
	@When("I enter (.*) , (.*) , (.*) , (.*)$")
	public void i_enter_multiple_todo(String enter_todo1, String enter_todo2, String enter_todo3, String enter_todo4) throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		todo.enter_to_do(enter_todo1);
		todo.enter_to_do(enter_todo2);
		todo.enter_to_do(enter_todo3);
		todo.enter_to_do(enter_todo4);
	}
	
	@Then("I see (.*) in the mvc page$")
	public void i_see_count_in_the_mvc_list(String count_value) throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		WebElement ele = driver.findElement(todo.list_count);
		if (ele.getText().equals(count_value)) {
			System.out.println("The total count " +count_value +" matches no. of todos entered in the MVC page");
		}
	}
	
	@When("I tap on active button$")
	public void i_tap_on_active_button() throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		WebElement active_button = driver.findElement(todo.active_button);
		active_button.click();
		
	}
	
	@Then("I see (.*) , (.*) , (.*) , (.*) in the active list$")
	public void i_see_todo_in_the_active_list(String enter_todo1, String enter_todo2, String enter_todo3, String enter_todo4) throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		List<WebElement> ele = driver.findElements(todo.list_value);
	    	if (ele.get(0).getText().equals(enter_todo1) && ele.get(1).getText().equals(enter_todo2) && ele.get(2).getText().equals(enter_todo3) && ele.get(3).getText().equals(enter_todo4))
	    		System.out.println("The Active tasks shown correctly in the active list of MVC page");
	}
	
	@When("I complete (.*)$")
	public void i_complete_todo(String enter_todo1) throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		List<WebElement> ele = driver.findElements(todo.list_value);
	    for(int i = 0; i < ele.size(); i++) {
	    	if (ele.get(i).getText().equals(enter_todo1)) {
	    		WebElement checkbox = ele.get(i).findElement(todo.complete_checkbox);
		        checkbox.click();
		        break;
	    	}
	    }
		
	}
	
	@And("I tap on completed button$")
	public void i_tap_on_completed_button() throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		WebElement completed_button = driver.findElement(todo.completed_button);
		completed_button.click();
		
	}
	
	@Then("I see (.*) in the completed list$")
	public void i_see_todo_in_the_completed_list(String enter_todo1) throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		List<WebElement> ele = driver.findElements(todo.list_value);
	    	if (ele.get(0).getText().equals(enter_todo1))
	    		System.out.println("The completed task shown correctly in the completed list of MVC page");

	}
	
	@And("I tap on all button$")
	public void i_tap_on_all_button() throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		WebElement all_button = driver.findElement(todo.all_button);
		all_button.click();
		
	}
	
	@Then("I see (.*) , (.*) , (.*) in the remaining active list$")
	public void i_see_remaining_todo_in_the_active_list(String enter_todo2, String enter_todo3, String enter_todo4) throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		List<WebElement> ele = driver.findElements(todo.list_value);
	    	if (ele.get(0).getText().equals(enter_todo2) && ele.get(1).getText().equals(enter_todo3) && ele.get(2).getText().equals(enter_todo4))
	    		System.out.println("The Active tasks shown correctly in the active list of MVC page");
	}
	
	@Then("I see (.*) , (.*), (.*) , (.*) in the all list$")
	public void i_see_todo_in_the_all_list(String enter_todo1, String enter_todo2, String enter_todo3, String enter_todo4) throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		List<WebElement> ele = driver.findElements(todo.list_value);
	    	if (ele.get(0).getText().equals(enter_todo1) && ele.get(1).getText().equals(enter_todo2) && ele.get(2).getText().equals(enter_todo3) && ele.get(3).getText().equals(enter_todo4))
	    		System.out.println("All tasks are shown correctly in the all list of MVC page");
	}
	
	@And("I tap on clear completed button$")
	public void i_tap_on_clear_completed_button() throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		WebElement clear_completed_button = driver.findElement(todo.clear_completed_button);
		clear_completed_button.click();
		
	}
	
	@Then("I dont see (.*) in the all list$")
	public void i_dont_see_todo_in_the_all_list(String enter_todo1) throws InterruptedException {
		ToDoMVCPages todo = new ToDoMVCPages(driver);
		List<WebElement> ele = driver.findElements(todo.list_value);
		for(int i = 0; i < ele.size(); i++) {
	    	if (ele.get(i).getText().equals(enter_todo1)) {
	    		System.out.println("Cleared completed task still present in the all list of MVC page");
		        break;
	    	}
	    }
	}
}
