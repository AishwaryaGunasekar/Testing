package com.solvd.web.pages.desktop;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.solvd.web.pages.common.NewsItem;
import com.solvd.web.pages.common.newsBasePage;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = newsBasePage.class)
public abstract class newsPage extends newsBasePage {

	
	@FindBy(xpath = "//label[text()='Search News']")
	private ExtendedWebElement searchButton;


    @FindBy(xpath = "//h1/span[text()='News']")
	private List<NewsItem> news;

	public newsPage(WebDriver driver) {
		super(driver);
		setPageURL("/news");
	}

	public List<NewsItem> searchNews(String q) {

		searchButton.click();
		return news;
	}

}
