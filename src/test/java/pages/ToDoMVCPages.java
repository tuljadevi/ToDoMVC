package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ToDoMVCPages {
	
	WebDriver driver;
	public By txt_to_do_name = By.className("new-todo");
	
	public By list_value = By.xpath("//div[@class='view']//label");
	
	public By list_count = By.xpath("//span[@class='todo-count']//strong");
	
	public By active_button = By.xpath("//a[@href='#/active']");
	
	public By completed_button = By.xpath("//a[@href='#/completed']");
	
	public By complete_checkbox = By.xpath("//input[@class='toggle']");
	
	public By all_button = By.xpath("//a[@href='#/all']");
	
	public By clear_completed_button = By.xpath("//button[@class='clear-completed']");
	
	public ToDoMVCPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enter_to_do(String enter_todo) throws InterruptedException {
		driver.findElement(txt_to_do_name).sendKeys(enter_todo);
		driver.findElement(txt_to_do_name).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

}
