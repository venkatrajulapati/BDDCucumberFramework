package com.app.testbase;

import org.openqa.selenium.WebElement;

public interface BaseWebElement extends WebElement {
	
	public boolean verifyPresent();
	public void mouseHover();
	public void mouseHoverAndClick();
	public void scrollAndClick();
	public void scrollAndDoubleClick();

}
