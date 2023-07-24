package com.solvd.web.pages.common;

import java.util.List;
import org.openqa.selenium.WebDriver;
import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class newsBasePage extends AbstractPage {

	public newsBasePage(WebDriver driver) {
		super(driver);
	}

	public abstract List<NewsItem> searchNews(String searchInput);

}
