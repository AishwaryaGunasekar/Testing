package com.solvd.web.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.web.pages.common.FeedBasePage;
import com.solvd.web.pages.common.HomeBasePage;
import com.solvd.web.pages.common.newsBasePage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomeBasePage.class)
public class homePage extends HomeBasePage {

	@FindBy(xpath = "//span[contains(text(),'Sam Samm')]")
	private ExtendedWebElement nametext;

	@FindBy(xpath = "//textarea[contains(@name,'message')]")
	private ExtendedWebElement writepost;

	@FindBy(xpath = "//button[contains(.'Post')]")
	private ExtendedWebElement addtoyourpost;

	@FindBy(xpath = "//a[@href='/news']")
	private ExtendedWebElement newsButton;

	@FindBy(xpath = "//div[@class='x6s0dn4 x78zum5 xl56j7k x1608yet xljgi0e x1e0frkt']")
	private ExtendedWebElement clickpost;

	@FindBy(xpath = "//span[contains(text(),'Feeds')]")
	private ExtendedWebElement feed;

	public homePage(WebDriver driver) {
		super(driver);
		setUiLoadedMarker(nametext);
		setPageAbsoluteURL("https://www.facebook.com/");

	}

	@Override
	public void createPost(String message) {
		writepost.click();
		writepost.type(message);
		addtoyourpost.click();

	}

	@Override
	public newsBasePage openNewsPage() {
		newsButton.click();
		return initPage(driver, newsBasePage.class);
	}


	@Override
	public FeedBasePage openFeedPage() {
		feed.click();
		return initPage(driver, FeedBasePage.class);
	}
}
